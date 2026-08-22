// 1. Solicita o texto ao usuário
texto = prompt("Digite um texto qualquer:");

if (texto === null || texto.trim() === "") {
    alert("Você não digitou nenhum texto!");
} else {
    letra = prompt("Agora, digite uma letra qualquer:");

    if (letra === null || letra.trim() === "") {
        alert("Você não digitou nenhuma letra!");
    } else {
        // Divide o texto em um array de palavras
        palavras = texto.split(" ");
        palavrasEncontradas = "";
        
        // Pega apenas o primeiro caractere da letra informada e ajusta para minúscula
        let letraBusca = letra.charAt(0).toLowerCase();

        // 3. Percorre as palavras verificando a letra inicial
        for (let i = 0; i < palavras.length; i++) {
            if (palavras[i].charAt(0).toLowerCase() === letraBusca) {
                palavrasEncontradas += palavras[i] + " ";
            }
        }

        // 4. Exibe o resultado no corpo do documento
        if (palavrasEncontradas === "") {
            document.write("Não há palavras que comecem com a letra '" + letra + "'.");
        } else {
            document.write("As palavras que começam com a letra '" + letra + "' são: " + palavrasEncontradas);
        }
    }
}