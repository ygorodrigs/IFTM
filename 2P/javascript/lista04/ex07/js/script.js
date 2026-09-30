// 7) Refatore o exercício 05, porém as informações do usuário e senha a serem armazenadas localmente no navegador deverão ser provenientes de um formulário na interface.

users = {
    usuarios: []
};

document.getElementById("botaoCadastrar").addEventListener("click", function () {
    username = document.getElementById("username");
    senha = document.getElementById("senha");

    users.usuarios.push({
        usuario: username.value,
        senha: senha.value
    });

    localStorage.setItem("users", JSON.stringify(users));

    username.value = "";
    senha.value = "";
})

/* Por que criar o vetor fora da função?

Fora da função: O vetor acumula os dados a cada clique.
Dentro da função: O vetor se reinicia a cada clique. 


- setItem é como guardar um documento etiquetado numa gaveta. getItem é ir até a gaveta e pegar o documento pela etiqueta.
- stringify é como dobrar e colocar uma roupa dentro de uma caixa para enviar pelo correio. parse é abrir a caixa e desdobrar a roupa para usar de novo.


*/

