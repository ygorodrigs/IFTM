const botao = document.getElementById("botao");
const caixa1 = document.getElementById("caixa1");
const caixa2 = document.getElementById("caixa2");

botao.addEventListener("click", function () {
    setTimeout(function () {
        caixa2.value = caixa1.value;
        caixa1.value = "";
    }, document.getElementById("tempo").value)
});