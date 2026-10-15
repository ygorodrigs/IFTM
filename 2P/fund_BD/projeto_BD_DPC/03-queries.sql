// renomear a coluna, na tabela adversários 

ALTER TABLE adversarios 
RENAME COLUMN nome TO time;


-- 1. Cria a função que verifica a regra do mando de quadra
CREATE OR REPLACE FUNCTION set_cidade_casa()
RETURNS TRIGGER AS $$
BEGIN
    -- Se o jogo for em casa e a cidade estiver vazia ou nula
    IF NEW.mando = 'casa' AND (NEW.cidade IS NULL OR NEW.cidade = '') THEN
        NEW.cidade := 'Uberlândia';
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- 2. Conecta a função à tabela partidas (executa ANTES de salvar a linha)
CREATE TRIGGER trg_set_cidade_casa
BEFORE INSERT OR UPDATE ON partidas
FOR EACH ROW
EXECUTE FUNCTION set_cidade_casa();

CREATE OR REPLACE FUNCTION auto_preencher_partida()
RETURNS TRIGGER AS $$
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
$$ LANGUAGE plpgsql;

-- Conecta a nova automação à tabela partidas
DROP TRIGGER IF EXISTS trg_set_cidade_casa ON partidas;

CREATE TRIGGER trg_auto_preencher_partida
BEFORE INSERT OR UPDATE ON partidas
FOR EACH ROW
EXECUTE FUNCTION auto_preencher_partida();