nomeCompleto = localStorage.getItem("usuario");
partes = nomeCompleto.split(" ");

document.getElementById("tituloMenu").innerHTML = partes[0] + " " + partes[partes.length - 1] + ", seja bem vindo ao jogo Felinos.";
window.location.href = "felinos.html";