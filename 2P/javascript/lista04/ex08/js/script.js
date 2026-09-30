// 8) Refatore o exercício 07 impedindo o cadastro de usuários iguais.


dadosSalvos = localStorage.getItem("users");

if (dadosSalvos !== null) {
    users = JSON.parse(dadosSalvos);
} else {
    users = {
        usuarios: []
    };
}

document.getElementById("botaoCadastrar").addEventListener("click", function () {
    username = document.getElementById("username");
    senha = document.getElementById("senha");

    usuarioExiste = false;

    for (i = 0; i < users.usuarios.length; i++) {
        if (users.usuarios[i].usuario === username.value) {
            usuarioExiste = true;
            break;
        }
    }

    if (usuarioExiste) {
        alert("Usuário já existe.");
    } else {
        alert("Usuário cadastrado com sucesso.");

        users.usuarios.push({
            usuario: username.value,
            senha: senha.value
        });

        localStorage.setItem("users", JSON.stringify(users));

        username.value = "";
        senha.value = "";
    }
});