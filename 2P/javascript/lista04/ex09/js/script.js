// 9) Implemente uma interface de LOGIN...

document.getElementById("botaoLogin").addEventListener("click", function () {

    username = document.getElementById("username");
    senha = document.getElementById("senha");

    dadosSalvos = localStorage.getItem("users");

    if (dadosSalvos === null) {
        alert("Usuário inexistente");
        return;
    }

    users = JSON.parse(dadosSalvos);
    usuarioEncontrado = false;

    for (i = 0; i < users.usuarios.length; i++) {
        if (users.usuarios[i].usuario === username.value && users.usuarios[i].senha === senha.value) {
            usuarioEncontrado = true;
            break;
        }
    }

    if (usuarioEncontrado) {
        alert("Usuário já existe/Acesso liberado)");
    } else {
        alert("Usuário inexistente/senha incorreta)");
    }

    username.value = "";
    senha.value = "";
});