// 6) Em relação ao exercício anterior, incremente ele listando no corpo da página todos os usuários e senhas armazenados localmente.

users = localStorage.setItem("users");

if (users == null) {
    document.write(`<p> Não há dados cadastrados</p>`);
}

else {
    users = JSON.parse(users); //O método JSON.parse() lê esse texto e o "reconstrói" em memória, transformando-o novamente em um Objeto/Vetor de verdade no JavaScript

    for (i = 0; i < users.usuarios.length; i++)
        document.write(`<p>${users.usuarios[i].usuario} ${users.usuarios[i].senha}</p>`);
}

