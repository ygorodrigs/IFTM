


SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;


COMMENT ON SCHEMA "public" IS 'standard public schema';



CREATE EXTENSION IF NOT EXISTS "pg_stat_statements" WITH SCHEMA "extensions";






CREATE EXTENSION IF NOT EXISTS "pgcrypto" WITH SCHEMA "extensions";






CREATE EXTENSION IF NOT EXISTS "supabase_vault" WITH SCHEMA "vault";






CREATE EXTENSION IF NOT EXISTS "uuid-ossp" WITH SCHEMA "extensions";






CREATE OR REPLACE FUNCTION "public"."auto_preencher_partida"() RETURNS "trigger"
    LANGUAGE "plpgsql"
    AS $$
BEGIN
    -- Se o jogo for EM CASA:
    IF NEW.mando = 'casa' THEN
        IF NEW.cidade IS NULL OR NEW.cidade = '' THEN
            NEW.cidade := 'Uberlândia';
        END IF;
        IF NEW.ginasio IS NULL OR NEW.ginasio = '' THEN
            NEW.ginasio := 'Uberlândia Tênis Clube';
        END IF;

    -- Se o jogo for FORA DE CASA:
    ELSIF NEW.mando = 'fora' THEN
        -- Busca o ginásio cadastrado na tabela de adversários se estiver em branco
        IF NEW.ginasio IS NULL OR NEW.ginasio = '' THEN
            SELECT ginasio INTO NEW.ginasio 
            FROM adversarios 
            WHERE id = NEW.id_adversario;
        END IF;
    END IF;

    RETURN NEW;
END;
$$;


ALTER FUNCTION "public"."auto_preencher_partida"() OWNER TO "postgres";


CREATE OR REPLACE FUNCTION "public"."set_cidade_casa"() RETURNS "trigger"
    LANGUAGE "plpgsql"
    AS $$
BEGIN
    -- Se o jogo for em casa e a cidade estiver vazia ou nula
    IF NEW.mando = 'casa' AND (NEW.cidade IS NULL OR NEW.cidade = '') THEN
        NEW.cidade := 'Uberlândia';
    END IF;
    RETURN NEW;
END;
$$;


ALTER FUNCTION "public"."set_cidade_casa"() OWNER TO "postgres";

SET default_tablespace = '';

SET default_table_access_method = "heap";


CREATE TABLE IF NOT EXISTS "public"."adversarios" (
    "id" integer NOT NULL,
    "time" character varying(50) NOT NULL,
    "nivel" character varying(20) NOT NULL,
    "estado" character varying(2),
    "ginasio" character varying(100)
);


ALTER TABLE "public"."adversarios" OWNER TO "postgres";


CREATE SEQUENCE IF NOT EXISTS "public"."adversarios_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE "public"."adversarios_id_seq" OWNER TO "postgres";


ALTER SEQUENCE "public"."adversarios_id_seq" OWNED BY "public"."adversarios"."id";



CREATE TABLE IF NOT EXISTS "public"."competicoes" (
    "id" integer NOT NULL,
    "nome" character varying(50) NOT NULL
);


ALTER TABLE "public"."competicoes" OWNER TO "postgres";


CREATE SEQUENCE IF NOT EXISTS "public"."competicoes_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE "public"."competicoes_id_seq" OWNER TO "postgres";


ALTER SEQUENCE "public"."competicoes_id_seq" OWNED BY "public"."competicoes"."id";



CREATE TABLE IF NOT EXISTS "public"."jogadoras" (
    "id" integer NOT NULL,
    "nome" character varying(40) NOT NULL,
    "data_nasc" "date" NOT NULL,
    "nacionalidade" character varying(20) NOT NULL,
    "numero_camisa" integer NOT NULL,
    "posicao" character varying(20) NOT NULL,
    "altura" double precision NOT NULL,
    CONSTRAINT "check_posicao" CHECK ((("posicao")::"text" = ANY ((ARRAY['levantadora'::character varying, 'ponteira'::character varying, 'oposta'::character varying, 'líbero'::character varying, 'central'::character varying])::"text"[])))
);


ALTER TABLE "public"."jogadoras" OWNER TO "postgres";


CREATE SEQUENCE IF NOT EXISTS "public"."jogadoras_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE "public"."jogadoras_id_seq" OWNER TO "postgres";


ALTER SEQUENCE "public"."jogadoras_id_seq" OWNED BY "public"."jogadoras"."id";



CREATE TABLE IF NOT EXISTS "public"."participacoes" (
    "id" integer NOT NULL,
    "id_partida" integer NOT NULL,
    "id_jogadora" integer NOT NULL,
    "ataques" integer DEFAULT 0,
    "bloqueios" integer DEFAULT 0,
    "aces" integer DEFAULT 0,
    "passes_excelentes" numeric(5,2) DEFAULT 0,
    "defesas" integer DEFAULT 0,
    "erros" integer DEFAULT 0,
    "pontos" integer GENERATED ALWAYS AS (((COALESCE("ataques", 0) + COALESCE("bloqueios", 0)) + COALESCE("aces", 0))) STORED
);


ALTER TABLE "public"."participacoes" OWNER TO "postgres";


CREATE SEQUENCE IF NOT EXISTS "public"."participacoes_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE "public"."participacoes_id_seq" OWNER TO "postgres";


ALTER SEQUENCE "public"."participacoes_id_seq" OWNED BY "public"."participacoes"."id";



CREATE TABLE IF NOT EXISTS "public"."partidas" (
    "id" integer NOT NULL,
    "data_partida" "date" NOT NULL,
    "sets_time" integer DEFAULT 0 NOT NULL,
    "sets_adversario" integer DEFAULT 0 NOT NULL,
    "id_adversario" integer NOT NULL,
    "id_competicao" integer NOT NULL,
    "mando" character varying(10) NOT NULL,
    "id_mvp" integer,
    "cidade" character varying(50),
    "ginasio" character varying(100),
    "mvp_externo" character varying(100),
    CONSTRAINT "partidas_mando_check" CHECK ((("mando")::"text" = ANY ((ARRAY['casa'::character varying, 'fora'::character varying, 'neutro'::character varying])::"text"[])))
);


ALTER TABLE "public"."partidas" OWNER TO "postgres";


CREATE SEQUENCE IF NOT EXISTS "public"."partidas_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE "public"."partidas_id_seq" OWNER TO "postgres";


ALTER SEQUENCE "public"."partidas_id_seq" OWNED BY "public"."partidas"."id";



ALTER TABLE ONLY "public"."adversarios" ALTER COLUMN "id" SET DEFAULT "nextval"('"public"."adversarios_id_seq"'::"regclass");



ALTER TABLE ONLY "public"."competicoes" ALTER COLUMN "id" SET DEFAULT "nextval"('"public"."competicoes_id_seq"'::"regclass");



ALTER TABLE ONLY "public"."jogadoras" ALTER COLUMN "id" SET DEFAULT "nextval"('"public"."jogadoras_id_seq"'::"regclass");



ALTER TABLE ONLY "public"."participacoes" ALTER COLUMN "id" SET DEFAULT "nextval"('"public"."participacoes_id_seq"'::"regclass");



ALTER TABLE ONLY "public"."partidas" ALTER COLUMN "id" SET DEFAULT "nextval"('"public"."partidas_id_seq"'::"regclass");



ALTER TABLE ONLY "public"."adversarios"
    ADD CONSTRAINT "adversarios_pkey" PRIMARY KEY ("id");



ALTER TABLE ONLY "public"."competicoes"
    ADD CONSTRAINT "competicoes_pkey" PRIMARY KEY ("id");



ALTER TABLE ONLY "public"."jogadoras"
    ADD CONSTRAINT "jogadoras_pkey" PRIMARY KEY ("id");



ALTER TABLE ONLY "public"."participacoes"
    ADD CONSTRAINT "participacoes_pkey" PRIMARY KEY ("id");



ALTER TABLE ONLY "public"."partidas"
    ADD CONSTRAINT "partidas_pkey" PRIMARY KEY ("id");



CREATE OR REPLACE TRIGGER "trg_auto_preencher_partida" BEFORE INSERT OR UPDATE ON "public"."partidas" FOR EACH ROW EXECUTE FUNCTION "public"."auto_preencher_partida"();



ALTER TABLE ONLY "public"."participacoes"
    ADD CONSTRAINT "participacoes_id_jogadora_fkey" FOREIGN KEY ("id_jogadora") REFERENCES "public"."jogadoras"("id");



ALTER TABLE ONLY "public"."participacoes"
    ADD CONSTRAINT "participacoes_id_partida_fkey" FOREIGN KEY ("id_partida") REFERENCES "public"."partidas"("id");



ALTER TABLE ONLY "public"."partidas"
    ADD CONSTRAINT "partidas_id_adversario_fkey" FOREIGN KEY ("id_adversario") REFERENCES "public"."adversarios"("id");



ALTER TABLE ONLY "public"."partidas"
    ADD CONSTRAINT "partidas_id_competicao_fkey" FOREIGN KEY ("id_competicao") REFERENCES "public"."competicoes"("id");



ALTER TABLE ONLY "public"."partidas"
    ADD CONSTRAINT "partidas_id_mvp_fkey" FOREIGN KEY ("id_mvp") REFERENCES "public"."jogadoras"("id");



ALTER TABLE "public"."adversarios" ENABLE ROW LEVEL SECURITY;


ALTER TABLE "public"."competicoes" ENABLE ROW LEVEL SECURITY;


ALTER TABLE "public"."jogadoras" ENABLE ROW LEVEL SECURITY;


ALTER TABLE "public"."participacoes" ENABLE ROW LEVEL SECURITY;


ALTER TABLE "public"."partidas" ENABLE ROW LEVEL SECURITY;




ALTER PUBLICATION "supabase_realtime" OWNER TO "postgres";


GRANT USAGE ON SCHEMA "public" TO "postgres";
GRANT USAGE ON SCHEMA "public" TO "anon";
GRANT USAGE ON SCHEMA "public" TO "authenticated";
GRANT USAGE ON SCHEMA "public" TO "service_role";






















































































































































GRANT ALL ON FUNCTION "public"."auto_preencher_partida"() TO "anon";
GRANT ALL ON FUNCTION "public"."auto_preencher_partida"() TO "authenticated";
GRANT ALL ON FUNCTION "public"."auto_preencher_partida"() TO "service_role";



GRANT ALL ON FUNCTION "public"."set_cidade_casa"() TO "anon";
GRANT ALL ON FUNCTION "public"."set_cidade_casa"() TO "authenticated";
GRANT ALL ON FUNCTION "public"."set_cidade_casa"() TO "service_role";


















GRANT ALL ON TABLE "public"."adversarios" TO "anon";
GRANT ALL ON TABLE "public"."adversarios" TO "authenticated";
GRANT ALL ON TABLE "public"."adversarios" TO "service_role";



GRANT ALL ON SEQUENCE "public"."adversarios_id_seq" TO "anon";
GRANT ALL ON SEQUENCE "public"."adversarios_id_seq" TO "authenticated";
GRANT ALL ON SEQUENCE "public"."adversarios_id_seq" TO "service_role";



GRANT ALL ON TABLE "public"."competicoes" TO "anon";
GRANT ALL ON TABLE "public"."competicoes" TO "authenticated";
GRANT ALL ON TABLE "public"."competicoes" TO "service_role";



GRANT ALL ON SEQUENCE "public"."competicoes_id_seq" TO "anon";
GRANT ALL ON SEQUENCE "public"."competicoes_id_seq" TO "authenticated";
GRANT ALL ON SEQUENCE "public"."competicoes_id_seq" TO "service_role";



GRANT ALL ON TABLE "public"."jogadoras" TO "anon";
GRANT ALL ON TABLE "public"."jogadoras" TO "authenticated";
GRANT ALL ON TABLE "public"."jogadoras" TO "service_role";



GRANT ALL ON SEQUENCE "public"."jogadoras_id_seq" TO "anon";
GRANT ALL ON SEQUENCE "public"."jogadoras_id_seq" TO "authenticated";
GRANT ALL ON SEQUENCE "public"."jogadoras_id_seq" TO "service_role";



GRANT ALL ON TABLE "public"."participacoes" TO "anon";
GRANT ALL ON TABLE "public"."participacoes" TO "authenticated";
GRANT ALL ON TABLE "public"."participacoes" TO "service_role";



GRANT ALL ON SEQUENCE "public"."participacoes_id_seq" TO "anon";
GRANT ALL ON SEQUENCE "public"."participacoes_id_seq" TO "authenticated";
GRANT ALL ON SEQUENCE "public"."participacoes_id_seq" TO "service_role";



GRANT ALL ON TABLE "public"."partidas" TO "anon";
GRANT ALL ON TABLE "public"."partidas" TO "authenticated";
GRANT ALL ON TABLE "public"."partidas" TO "service_role";



GRANT ALL ON SEQUENCE "public"."partidas_id_seq" TO "anon";
GRANT ALL ON SEQUENCE "public"."partidas_id_seq" TO "authenticated";
GRANT ALL ON SEQUENCE "public"."partidas_id_seq" TO "service_role";









ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON SEQUENCES TO "postgres";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON SEQUENCES TO "anon";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON SEQUENCES TO "authenticated";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON SEQUENCES TO "service_role";






ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON FUNCTIONS TO "postgres";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON FUNCTIONS TO "anon";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON FUNCTIONS TO "authenticated";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON FUNCTIONS TO "service_role";






ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON TABLES TO "postgres";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON TABLES TO "anon";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON TABLES TO "authenticated";
ALTER DEFAULT PRIVILEGES FOR ROLE "postgres" IN SCHEMA "public" GRANT ALL ON TABLES TO "service_role";































