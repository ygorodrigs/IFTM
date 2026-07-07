<?php
// 1. Importa os arquivos com caminhos seguros
require_once __DIR__ . '/../config/Database.php';
require_once __DIR__ . '/../app/Repositories/cadastroalunosRepository.php';
require_once __DIR__ . '/../app/Services/cadastroalunosService.php';

// 2. Instancia o Repository
$repository = new cadastroalunosRepository();

// 3. Injeta o Repository dentro do Service
$service = new cadastroalunosService($repository);

// 4. Executa a criação passando os dados do formulário
$resultado = $service->criar($_POST);

// 5. Verifica se deu sucesso ou erro para definir a mensagem
$mensagem = $resultado['sucesso'] ?? $resultado['erro'] ?? 'Erro inesperado.';

// 6. Redireciona de volta para a página do formulário (mude para o nome correto da sua página, ex: index.php ou formulario.php)
header('Location: index.php?msg=' . urlencode($mensagem));
exit;