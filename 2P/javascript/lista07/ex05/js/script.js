const conteinerNomes = document.getElementById("nomes");
const quantidade = parseInt(prompt("Informe um número, com a quantidade de nomes:"));

const listaNome = [];

if (quantidade > 0) {
    for (let i = 0; i < quantidade; i++) {
        const nome = prompt(`Informe o nome ${i + 1} de ${quantidade}:`);
        listaNome.push(nome);
    }

    let indice = 0; 

    const intervalo = setInterval(function() {
        if (indice < listaNome.length) {
            conteinerNomes.innerHTML += `${listaNome[indice]}<br>`;
            indice++; 
        } else {
            clearInterval(intervalo);
        }
    }, 1000);
}