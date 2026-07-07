<?php
class cadastroalunosRepository
{
    public function salvar(array $dados): bool
    {
        $pdo = Database::conectar();
        $sql = "INSERT INTO cadastroalunos (nome, email, curso)
VALUES (:nome, :email, :curso)";
        $stmt = $pdo->prepare($sql);
        return $stmt->execute([
            ':nome' => $dados['nome'],
            ':email' => $dados['email'],
            ':curso' => $dados['curso']
        ]);
    }
}
