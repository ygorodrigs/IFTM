<?php

class cadastroalunosService
{
    private $repository;

    public function __construct(cadastroalunosRepository $repository)
    {
        $this->repository = $repository;
    }

    public function criar(array $dados): array
    {
        $nome = trim($dados['nome'] ?? '');
        $email = trim($dados['email'] ?? '');
        $curso = trim($dados['curso'] ?? ''); // Captura o curso corretamente

        if ($nome === '') {
            return ['erro' => 'O nome é obrigatório.'];
        }

        if (strlen($nome) < 3) {
            return ['erro' => 'O nome deve ter pelo menos 3 caracteres.'];
        }

        if ($email === '') {
            return ['erro' => 'O e-mail é obrigatório.'];
        }

        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            return ['erro' => 'O e-mail informado é inválido.'];
        }

        if ($curso === '') {
            return ['erro' => 'O curso é obrigatório.'];
        }

        // Chamando o repositório com a variável correta ($curso)
        $this->repository->salvar([
            'nome' => $nome,
            'email' => $email,
            'curso' => $curso 
        ]);

        return ['sucesso' => 'Cadastro salvo com sucesso.'];
    }
}