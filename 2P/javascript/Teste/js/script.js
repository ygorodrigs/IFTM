alert("Olá, seja bem-vindo")

document.getElementById("botaoEntrar").addEventListener("click", function (){
    nomeCompleto = document.getElementById("nomeCompleto").value.trim();
    partes = nomeCompleto.split(" ");
    if (nomeCompleto == ("") || partes.length < 2) {
        alert("Necessário nome e sobrenome");        
    }
    else {
        localStorage.setItem("usuario", nomeCompleto);
        window.location.href = "menu.html";
    } 
});