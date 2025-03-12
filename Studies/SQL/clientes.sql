-- Criar banco
CREATE DATABASE Projeto;

-- Selecionar banco
USE Projeto;

-- Criar tabela
CREATE TABLE Clientes (
    cpf INT(30) PRIMARY KEY,
    nome VARCHAR(30),
    email VARCHAR(30),
    telefone VARCHAR(30),
    endereco VARCHAR(30),
    sexo CHAR(1)
);

CREATE TABLE Produtos (
    idProduto INT(5) PRIMARY KEY,
    nome VARCHAR(30),
    valor FLOAT(10,2), -- 10 Casas NO TOTAL e 2 depois da virgula, 10 incluindo a vírgula.
    quantidade INT(30)
);

-- Exibir detalhes da tabela
SHOW TABLES;
DESC Clientes;