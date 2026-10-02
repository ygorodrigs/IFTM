var txtNome = document.getElementById("txtNome")
var btn1 = document.getElementById("btn1")
var btn2 = document.getElementById("btn2")
var btn3 = document.getElementById("btn3")
var btn4 = document.getElementById("btn4")
var boasVindas = document.getElementById("boasVindas")

var imgs = [
    "img/emoji1.jpg",
    "img/emoji2.jpg",
    "img/emoji3.jpg",
    "img/emoji4.jpg",
    "img/emoji5.jpg",
]

txtNome.addEventListener("change", function (){
    boasVindas.innerHTML = "Olá, " + txtNome.value
})

btn1.addEventListener("click", function (){
    img.src = imgs[0]
})

btn2.addEventListener("mousemove", function (){
    img.src = imgs[1]
})

btn3.addEventListener("mouseleave", function (){
    img.src = imgs[2]
})

btn4.addEventListener("click", function (){
    img.src = imgs[parseInt(Math.random()*imgs.length-1)]
})

alert("Olá, seja bem-vindo!")

document.getElementById("botaoEntrar").addEventListener("click", function () {

    nomeCompleto = document.getElementById("nomeCompleto").value.trim();
    if (nomeCompleto == ("") || nomeCompleto.split(" ").length < 2) {
        alert("Necessário informar nome + sobrenome");
    }
    else {
        localStorage.setItem("usuario", nomeCompleto);
        window.location.href = "menu.html";
    }
});



// .trim() remove os espaços em brancos do começo e do final do texto


// Ao clicar no botão botaoEntrar, é executada uma função. Nela, pego o elemento nomeCompleto e seu valor (.value) e armazeno na variável nomeCompleto. Depois faço uma validação: o .trim() remove os espaços do começo e do final; se, depois disso, o valor estiver vazio, aparece o alert. Também uso .split(" ") para separar o nome usando o espaço como delimitador, transformando-o em um array. Com .length, verifico quantos elementos existem; se houver menos de 2, aparece o alert, pois é necessário informar nome e sobrenome. Se nenhuma dessas condições acontecer, o else é executado e o nome é armazenado no localStorage do navegador com a chave "usuario".

nomeCompleto = localStorage.getItem("usuario");
partes = nomeCompleto.split(" ");
document.getElementById("tituloMenu").innerHTML = partes[0] + " " + partes[partes.length - 1] + ", seja bem-vindo ao jogo dos Felinos!";

botaoConvidado.addEventListener("click", function() {
    window.location.href = "felinos.html"; 
});

// Eu recupero os dados salvos no navegador por meio do getItem, utilizando a chave "usuario". Depois, transformo o conteúdo de nomeCompleto em um array usando split(" "), separando as palavras pelos espaços e armazenando o resultado na variável partes. Em seguida, seleciono o elemento com o ID "tituloMenu" e utilizo innerHTML para alterar seu conteúdo. Por fim, faço uma concatenação do primeiro índice do array, adiciono um espaço, o último índice do array e o restante da frase.

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

1. JSON.stringify() (Objeto $\rightarrow$ Texto)O que faz: Converte um objeto, array ou valor do JavaScript em uma string em formato JSON (texto).Por que usar: O localStorage só aceita guardar textos simples. Se você tentar salvar um objeto direto sem converter, o navegador salvará a palavra "[object Object]".

const jogador = { nome: "Ana", pontos: 50 };
const textoJSON = JSON.stringify(jogador); 
// Resultado: '{"nome":"Ana","pontos":50}'

2. JSON.parse() (Texto $\rightarrow$ Objeto)O que faz: Faz o caminho oposto do stringify. Pega uma string em formato JSON e a converte de volta em um objeto ou array navegável do JavaScript.Por que usar: Quando você busca dados do localStorage, eles chegam como texto puro. O parse permite que você volte a acessar as propriedades (ex: objeto.pontos).

const textoJSON = '{"nome":"Ana","pontos":50}';
const jogador = JSON.parse(textoJSON); 
// Resultado: objeto JS real -> console.log(jogador.pontos) // 50

3. setItem() (Salvar / Guardar)
O que faz: Grava uma informação no armazenamento interno do navegador (localStorage) associada a uma chave identificadora.

Sintaxe: localStorage.setItem("nomeDaChave", "valor")

localStorage.setItem("usuario", "João");

4. getItem() (Buscar / Ler)
O que faz: Recupera um valor do localStorage através do nome da chave. Se a chave não existir, ele retorna null.

Sintaxe: localStorage.getItem("nomeDaChave")

const usuarioSalvo = localStorage.getItem("usuario"); // Retorna "João"

users = {
    usuarios: []
};

document.getElementById("botaoCadastrar").addEventListener("click", function () {
    username = document.getElementById("username");
    senha = document.getElementById("senha");

    users.usuarios.push({
        usuario: username.value,
        senha: senha.value
    });

    localStorage.setItem("users", JSON.stringify(users));

    username.value = "";
    senha.value = "";
})

/* Por que criar o vetor fora da função?

Fora da função: O vetor acumula os dados a cada clique.
Dentro da função: O vetor se reinicia a cada clique. 


- setItem é como guardar um documento etiquetado numa gaveta. getItem é ir até a gaveta e pegar o documento pela etiqueta.
- stringify é como dobrar e colocar uma roupa dentro de uma caixa para enviar pelo correio. parse é abrir a caixa e desdobrar a roupa para usar de novo.


*/