nomeCompleto = localStorage.getItem("usuario");
partes = nomeCompleto.split(" ");

document.getElementById("gato01").addEventListener("click", function(){
    alert(`${partes[0]}, tudo bem com você?`)
});

carinhos = document.getElementById("carinhos");
contadorCarinhos = 0;

document.getElementById("gato02").addEventListener("click", function(){
    contadorCarinhos++;
    carinhos.innerHTML = `Carinhos: ${contadorCarinhos}`;
});

gato03 = document.getElementById("gato03");

gato03.addEventListener("mouseenter", function(){
    gato03.src = 'img/gato06.gif';
});

document.getElementById("gato03").addEventListener("mouseleave", function(){
    gato03.src = 'img/gato03.gif';
});

gato04 = document.getElementById("gato04");
textoGato04 = document.getElementById("textoGato04");
gato04.addEventListener("mouseenter", function(){
    textoGato04.innerHTML = 'Ai, pare de fazer cócegas!';
});

gato04.addEventListener("mouseleave", function(){
    textoGato04.innerHTML = 'la la la la la';
});

gato05 = document.getElementById("gato05");
botaoSorte = document.getElementById("botaoSorte");
inputSorte = document.getElementById("inputSorte");
botaoSorte.addEventListener("click", function(){
    numeroAleatorio = Math.floor(Math.random() * 100) + 1;
    inputSorte.value = numeroAleatorio;
});