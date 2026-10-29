const nomeCompleto = document.getElementById("nomeCompleto");
const exibir = document.getElementById("exibir");
const botao = document.getElementById("botao");

let intervalo;

botao.addEventListener("click", function () {

    clearInterval(intervalo);
    exibir.innerHTML = nomeCompleto.value;

    let tamanhoFonte = 14;
    exibir.style.fontSize = `${tamanhoFonte}px`;

    intervalo = setInterval(function () {
        if (tamanhoFonte < 40) {
            tamanhoFonte += 2;
            exibir.style.fontSize = `${tamanhoFonte}px`
        }
        else {
            clearInterval(intervalo);
        }
    }, 500)
});

