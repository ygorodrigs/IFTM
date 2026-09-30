nomeCompleto = localStorage.getItem("usuario");
partes = nomeCompleto.split(" ");
document.getElementById("tituloMenu").innerHTML = partes[0] + " " + partes[partes.length - 1] + ", seja bem-vindo ao jogo dos Felinos!";

botaoConvidado.addEventListener("click", function() {
    window.location.href = "felinos.html"; 
});

// Eu recupero os dados salvos no navegador por meio do getItem, utilizando a chave "usuario". Depois, transformo o conteúdo de nomeCompleto em um array usando split(" "), separando as palavras pelos espaços e armazenando o resultado na variável partes. Em seguida, seleciono o elemento com o ID "tituloMenu" e utilizo innerHTML para alterar seu conteúdo. Por fim, faço uma concatenação do primeiro índice do array, adiciono um espaço, o último índice do array e o restante da frase.