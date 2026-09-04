const btn = document.getElementById("botaoExibir");
const input = document.getElementById("input");

btn.addEventListener("click", exibir);

function exibir() {
    alert(input.value.toUpperCase());
}