const input = document.getElementById("input");
const btn = document.getElementById("botaoDobro");
const output = document.getElementById("output");

btn.addEventListener("click", exibirDobro);

function exibirDobro() {
    output.value = input.value * 2;
}