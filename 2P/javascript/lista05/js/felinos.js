nomeCompleto = localStorage.getItem("usuario");
partes = nomeCompleto.split(" ");

gato01 = document.getElementById("gato01");
gato01.addEventListener("click", function () {
    alert(`Oi, ${partes[0]}. Tudo bem com você?`);
});

gato02 = document.getElementById("gato02");
carinhos = document.getElementById("carinhos");
contadorCarinhos = 0;

gato02.addEventListener("click", function() {
    contadorCarinhos++;
    carinhos.innerHTML = `Carinhos: ${contadorCarinhos}`;
});

gato03 = document.getElementById("gato03");
gato03.addEventListener("mouseenter", function() {
    gato03.src = 'img/gato06.gif';
});

gato03.addEventListener("mouseleave", function () {
    gato03.src = 'img/gato03.gif';
});

textoGato04 = document.getElementById("textoGato04");
gato04 = document.getElementById("gato04");
gato04.addEventListener("mouseenter", function () {
    textoGato04.innerHTML = 'Ai, pare de fazer cócegas!';
});

gato04.addEventListener("mouseleave", function () {
    textoGato04.innerHTML = 'lá lá lá lá lá';
});

botaoSorte = document.getElementById("botaoSorte");
inputSorte = document.getElementById('inputSorte');

botaoSorte.addEventListener("click", function () {
    numeroAleatorio = Math.floor(Math.random() * 100) + 1;
    inputSorte.value = numeroAleatorio;
});