CREATE TABLE jogadoras (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    data_nasc DATE NOT NULL,
    nacionalidade VARCHAR(20) NOT NULL,
    numero_camisa INT NOT NULL,
    posicao VARCHAR(20) NOT NULL,
    altura FLOAT NOT NULL
);

CREATE TABLE competicoes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE adversarios (
    id SERIAL PRIMARY KEY,
    time VARCHAR(50) NOT NULL,
    nivel VARCHAR(20) NOT NULL,
    estado VARCHAR(2)
);

CREATE TABLE partidas (
    id SERIAL PRIMARY KEY,
    data_partida DATE NOT NULL,
    mandante BOOLEAN NOT NULL,
    sets_time INT NOT NULL DEFAULT 0,
    sets_adversario INT NOT NULL DEFAULT 0,
    id_adversario INT NOT NULL REFERENCES adversarios(id),
    id_competicao INT NOT NULL REFERENCES competicoes(id)
);

CREATE TABLE participacoes (
    id SERIAL PRIMARY KEY,
    id_partida INT NOT NULL REFERENCES partidas(id),
    id_jogadora INT NOT NULL REFERENCES jogadoras(id),
    pontos_ataque INT DEFAULT 0,
    bloqueios INT DEFAULT 0,
    aces INT DEFAULT 0,
    passes_excelentes INT DEFAULT 0,
    defesas INT DEFAULT 0,
    erros INT DEFAULT 0
);