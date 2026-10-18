SET session_replication_role = replica;

--
-- PostgreSQL database dump
--

-- \restrict oEIbe2VrEBHrdyxs6YqZ6UAo9haelS2bMTQilaCzOWRgYUMe9XeQ7eeMQAXfziG

-- Dumped from database version 17.11
-- Dumped by pg_dump version 17.11

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: audit_log_entries; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: custom_oauth_providers; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: flow_state; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: users; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: identities; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: instances; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: oauth_clients; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: sessions; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: mfa_amr_claims; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: mfa_factors; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: mfa_challenges; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: mfa_recovery_code_sets; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: mfa_recovery_codes; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: oauth_authorizations; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: oauth_client_states; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: oauth_consents; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: one_time_tokens; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: refresh_tokens; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: sso_providers; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: saml_providers; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: saml_relay_states; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: scim_tokens; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: scim_users; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: sso_domains; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: webauthn_challenges; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: webauthn_credentials; Type: TABLE DATA; Schema: auth; Owner: supabase_auth_admin
--



--
-- Data for Name: adversarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO "public"."adversarios" ("id", "time", "nivel", "estado", "ginasio") VALUES
	(7, 'Osasco São Cristóvão Saúde', 'favorita', 'SP', 'Ginásio José Liberatti'),
	(6, 'Gerdau Minas', 'favorita', 'MG', 'Arena UniBH'),
	(10, 'Sesc RJ Flamengo', 'favorita', 'RJ', 'Ginásio do Tijuca'),
	(1, 'ABEL Moda Vôlei Brusque', 'desafiante', 'SC', 'Sesi Brusque'),
	(3, 'Brasília Vôlei', 'desafiante', 'DF', 'Ginásio FVDF'),
	(9, 'Sancor Seguros Vôlei Londrina', 'competitiva', 'PR', 'Ginásio Moringão'),
	(11, 'Sesi Vôlei Bauru', 'competitiva', 'SP', 'Arena Paulo Skaf'),
	(5, 'Fluminense', 'competitiva', 'RJ', 'Ginásio da Hebraica'),
	(2, 'Batavo Mackenzie', 'competitiva', 'MG', 'Ginásio do Mackenzie'),
	(4, 'Esporte Clube Pinheiros', 'desafiante', 'SP', 'Ginásio do Pinheiros'),
	(8, 'Paulistano Barueri', 'desafiante', 'SP', 'Sportville');


--
-- Data for Name: competicoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO "public"."competicoes" ("id", "nome") VALUES
	(4, 'SuperCopa'),
	(5, 'Superliga'),
	(6, 'Copa Brasil');


--
-- Data for Name: jogadoras; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO "public"."jogadoras" ("id", "nome", "data_nasc", "nacionalidade", "numero_camisa", "posicao", "altura") VALUES
	(16, 'Macris', '1989-03-03', 'Brasil', 3, 'levantadora', 1.78),
	(17, 'Fabiola', '1983-02-03', 'Brasil', 14, 'levantadora', 1.85),
	(18, 'Milla', '1992-05-12', 'Brasil', 20, 'levantadora', 1.76),
	(19, 'Sabrina', '1996-04-09', 'Brasil', 9, 'oposta', 1.84),
	(20, 'Carla', '1992-01-17', 'Brasil', 13, 'oposta', 1.74),
	(21, 'Sofya Kuznetsova', '1999-10-31', 'Rússia', 7, 'ponteira', 1.85),
	(22, 'Michele Pavão', '1986-10-30', 'Brasil', 10, 'ponteira', 1.79),
	(23, 'Andrea Mitrovic', '1999-06-03', 'Canadá', 11, 'ponteira', 1.87),
	(24, 'Drussyla', '1996-07-01', 'Brasil', 15, 'ponteira', 1.84),
	(25, 'Adenízia', '1986-12-18', 'Brasil', 5, 'central', 1.89),
	(26, 'Lara Nobre', '1989-02-11', 'Brasil', 8, 'central', 1.88),
	(27, 'Lanna', '2000-01-04', 'Brasil', 18, 'central', 1.89),
	(28, 'Ana Carolina', '2004-01-01', 'Brasil', 19, 'central', 1.83),
	(29, 'Natinha', '1997-04-10', 'Brasil', 2, 'líbero', 1.62),
	(30, 'Suelen', '1987-10-04', 'Brasil', 17, 'líbero', 1.71);


--
-- Data for Name: partidas; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO "public"."partidas" ("id", "data_partida", "sets_time", "sets_adversario", "id_adversario", "id_competicao", "mando", "id_mvp", "cidade", "ginasio", "mvp_externo") VALUES
	(2, '2026-10-20', 0, 0, 4, 5, 'casa', NULL, 'Uberlãndia', 'Uberlândia Tênis Clube', NULL),
	(3, '2026-10-24', 0, 0, 1, 5, 'fora', NULL, 'Brusque', 'Sesi Brusque', NULL),
	(4, '2026-10-30', 0, 0, 8, 5, 'casa', NULL, 'Uberlândia', 'Uberlândia Tênis Clube', NULL),
	(5, '2026-11-07', 0, 0, 3, 5, 'fora', NULL, 'Brasília', 'Ginásio FVDF', NULL),
	(6, '2026-11-13', 0, 0, 2, 5, 'casa', NULL, 'Uberlândia', 'Uberlândia Tênis Clube', NULL),
	(7, '2026-11-18', 0, 0, 9, 5, 'fora', NULL, 'Londrina', 'Ginásio Moringão', NULL),
	(8, '2026-11-24', 0, 0, 5, 5, 'casa', NULL, 'Uberlândia', 'Uberlândia Tênis Clube', NULL),
	(9, '2026-11-27', 0, 0, 7, 5, 'casa', NULL, 'Uberlândia', 'Uberlândia Tênis Clube', NULL),
	(10, '2026-12-04', 0, 0, 11, 5, 'fora', NULL, 'Bauru', 'Arena Paulo Skaf', NULL),
	(11, '2026-12-14', 0, 0, 10, 5, 'fora', NULL, 'Rio de Janeiro', 'Ginásio do Tijuca', NULL),
	(12, '2026-12-21', 0, 0, 6, 5, 'fora', NULL, 'Belo Horizonte', 'Arena UniBH', NULL),
	(1, '2026-10-16', 0, 0, 7, 4, 'neutro', NULL, 'São Luís do Maranhão', 'Arena Castelinho', 'Tiffany | Osasco São Cristóvão Saúde');


--
-- Data for Name: participacoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO "public"."participacoes" ("id", "id_partida", "id_jogadora", "ataques", "bloqueios", "aces", "passes_excelentes", "defesas", "erros") VALUES
	(1, 1, 29, 0, 0, 0, 75.00, 11, 0),
	(2, 1, 16, 0, 0, 0, 0.00, 4, 0),
	(3, 1, 25, 3, 4, 0, 33.00, 0, 2),
	(4, 1, 21, 6, 0, 0, 8.00, 2, 5),
	(5, 1, 26, 1, 2, 0, 0.00, 2, 1),
	(6, 1, 19, 16, 0, 1, 0.00, 8, 4),
	(7, 1, 22, 5, 2, 0, 30.00, 7, 5),
	(8, 1, 23, 3, 0, 1, 21.00, 6, 4),
	(9, 1, 17, 0, 0, 0, 0.00, 5, 0),
	(10, 1, 24, 0, 0, 0, 100.00, 0, 0),
	(11, 1, 27, 2, 1, 0, 0.00, 0, 1);


--
-- Data for Name: buckets; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: buckets_analytics; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: buckets_vectors; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: objects; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: s3_multipart_uploads; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: s3_multipart_uploads_parts; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Data for Name: vector_indexes; Type: TABLE DATA; Schema: storage; Owner: supabase_storage_admin
--



--
-- Name: refresh_tokens_id_seq; Type: SEQUENCE SET; Schema: auth; Owner: supabase_auth_admin
--

SELECT pg_catalog.setval('"auth"."refresh_tokens_id_seq"', 1, false);


--
-- Name: adversarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('"public"."adversarios_id_seq"', 11, true);


--
-- Name: competicoes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('"public"."competicoes_id_seq"', 6, true);


--
-- Name: jogadoras_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('"public"."jogadoras_id_seq"', 30, true);


--
-- Name: participacoes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('"public"."participacoes_id_seq"', 11, true);


--
-- Name: partidas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('"public"."partidas_id_seq"', 12, true);


--
-- PostgreSQL database dump complete
--

-- \unrestrict oEIbe2VrEBHrdyxs6YqZ6UAo9haelS2bMTQilaCzOWRgYUMe9XeQ7eeMQAXfziG

RESET ALL;
