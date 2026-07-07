<?php

class Database
{
    public static function conectar(): PDO
    {
        $host = 'localhost';
        $dbname = 'aula_camadas';
        $usuario = 'root';
        $senha = '';
        
        try {
            $pdo = new PDO(
                "mysql:host=$host;dbname=$dbname;charset=utf8mb4",
                $usuario,
                $senha
            );

            // Configura o PDO para lançar exceções em caso de erros
            $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            return $pdo;

        } catch (PDOException $e) {
            // Em vez de die(), lançamos uma nova exceção ou tratamos em logs
            throw new Exception('Erro ao conectar ao banco de dados: ' . $e->getMessage());
        }
    }
}