<?php
$mensagem = $_GET['msg'] ?? '';
?>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <title>Cadastro de Alunos</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 40px;
        }

        .container {
            background-color: #ffffff;
            padding: 25px;
            max-width: 500px;
            margin: auto;
            border-radius: 8px;
            box-shadow: 0 0 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }

        input,
        textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        textarea {
            height: 100px;
        }

        button {
            margin-top: 20px;
            width: 100%;
            padding: 10px;
            background-color: #0066cc;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #004c99;
        }

        .curso {
            padding: 10px;
            background-color: #e8f4ff;
            border: 1px solid #99ccff;
            margin-bottom: 15px;
            text-align: center;
        }

        .fluxo {
            font-size: 14px;
            background-color: #f8f8f8;
            padding: 10px;
            border-left: 4px solid #0066cc;
            margin-bottom: 20px;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Cadastro de Alunos</h1>
        <div class="fluxo">
            Fluxo da aplicação:<br>
            Formulário → Controller → Service → Repository → Banco de
            Dados
        </div>
        <?php if ($mensagem !== ''): ?>
            <div class="mensagem">
                <?= htmlspecialchars($mensagem) ?>
            </div>
        <?php endif; ?>
        <form action="salvar_contato.php" method="post">

            <label for="nome">Nome:</label>
            <input type="text" name="nome" id="nome">
            <label for="email">E-mail:</label>
            <input type="text" name="email" id="email">
            <label for="curso">Curso:</label>
            <input type="text" name="curso" id="curso">
            <button type="submit">Salvar Cadastro</button>
        </form>
    </div>
</body>

</html>