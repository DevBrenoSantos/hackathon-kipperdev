-- script.sql

CREATE TABLE Institution (
    id SERIAL PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    adress VARCHAR(255) NOT NULL,
    CNPJ VARCHAR(14) NOT NULL UNIQUE,
);
