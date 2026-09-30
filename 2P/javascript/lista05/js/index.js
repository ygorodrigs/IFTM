alert("Olá, seja bem-vindo!")

document.getElementById("botaoEntrar").addEventListener("click", function () {

    nomeCompleto = document.getElementById("nomeCompleto").value.trim();
    if (nomeCompleto == ("") || nomeCompleto.split(" ").length < 2) {
        alert("Necessário informar nome + sobrenome");
    }
    else {
        localStorage.setItem("usuario", nomeCompleto);
        window.location.href = "menu.html";
    }
});



// .trim() remove os espaços em brancos do começo e do final do texto


// Ao clicar no botão botaoEntrar, é executada uma função. Nela, pego o elemento nomeCompleto e seu valor (.value) e armazeno na variável nomeCompleto. Depois faço uma validação: o .trim() remove os espaços do começo e do final; se, depois disso, o valor estiver vazio, aparece o alert. Também uso .split(" ") para separar o nome usando o espaço como delimitador, transformando-o em um array. Com .length, verifico quantos elementos existem; se houver menos de 2, aparece o alert, pois é necessário informar nome e sobrenome. Se nenhuma dessas condições acontecer, o else é executado e o nome é armazenado no localStorage do navegador com a chave "usuario".