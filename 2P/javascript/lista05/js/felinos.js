nomeCompleto = localStorage.getItem("usuario");

gato01 = document.getElementById("gato02");
gato01.addEventListener('click', () => {
    const nomeCompleto = localStorage.getItem('nomeCompleto') || 'Usuário';
    const primeiroNome = nomeCompleto.split(' ')[0];
    alert(`Oi ${primeiroNome}, tudo bem com você?`);
});

// Gato 02: Incremento de carinhos
const gato02 = document.getElementById('gato02');
const textoCarinhos = document.getElementById('textoCarinhos');
let contadorCarinhos = 0;

gato02.addEventListener('click', () => {
    contadorCarinhos++;
    textoCarinhos.innerText = `Carinhos: ${contadorCarinhos}`;
});

// Gato 03: Troca de imagem no hover
const gato03 = document.getElementById('gato03');
gato03.addEventListener('mouseenter', () => {
    gato03.src = 'img/gato06.gif';
});
gato03.addEventListener('mouseleave', () => {
    gato03.src = 'img/gato03.gif';
});

// Gato 04: Troca de texto no hover
const gato04 = document.getElementById('gato04');
const textoGato04 = document.getElementById('textoGato04');

gato04.addEventListener('mouseenter', () => {
    textoGato04.innerText = 'Ai, pare de fazer cócegas!';
});
gato04.addEventListener('mouseleave', () => {
    textoGato04.innerText = 'lá lá lá lá lá';
});

// Gato 05: Número aleatório
const btnSorte = document.getElementById('btnSorte');
const inputSorte = document.getElementById('inputSorte');

btnSorte.addEventListener('click', () => {
    // Math.random() gera entre 0 e 1. Multiplicar por 100 e arredondar dá o range desejado.
    const numeroAleatorio = Math.floor(Math.random() * 100) + 1;
    inputSorte.value = numeroAleatorio;
});