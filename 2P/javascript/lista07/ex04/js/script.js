const segundosInformado = document.getElementById("segundos");
const exibir = document.getElementById("exibir");
const botao = document.getElementById("botao");

let contagem;

botao.addEventListener("click", function () {
    let segundos = parseInt(segundosInformado.value.trim(), 10);

    clearInterval(contagem);

    exibir.innerText = `Por favor, aguarde ${segundos} segundos para carregar a página do Google.`;

    contagem = setInterval(function () {
        segundos--;

        if (segundos > 0) {
            exibir.innerText = `Por favor, aguarde ${segundos} segundos para carregar a página do Google.`;
        } else {
            exibir.innerText = "Carregando a página do Google...";
            clearInterval(contagem);
            
            // Redireciona na mesma aba
            window.location.href = "https://www.google.com";
        }
    }, 1000);
});