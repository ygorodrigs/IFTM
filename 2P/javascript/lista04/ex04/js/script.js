// 4) Refaça o exercício anterior, porém as informações (usuário e senha) deverão ser informadas a partir de um formulário na interface.


document.getElementById("botaoCadastrar").addEventListener("click", function() {
    username = document.getElementById("username");
    senha = document.getElementById("senha");

    usuario = { nome: username.value, senha: senha.value };
    localStorage.setItem("usuario", JSON.stringify(usuario));
});

/* 

document.getElementById(" ") é usado para encontrar e selecionar um elemento especifico em uma página HTML, atraves do seu atributo id
document.addEventListener("click", function) é um ouvinte/espião. quando o usuário der um clique, faça algo  

*/