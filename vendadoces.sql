CREATE DATABASE IF NOT EXISTS vendadoces;
USE vendadoces;

CREATE TABLE IF NOT EXISTS venda_de_doces (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL
);

INSERT INTO venda_de_doces (nome_cliente, valor) VALUES
('Cliente 1', 10.5),
('Cliente 2', 15.0);
