nomeCompleto = prompt("Digite o seu nome completo:").trim(); // o comando .trim() remove os espaços

if (nomeCompleto != null) { // pressionou o botão ok?
    if (nomeCompleto == "") {
        document.write(`<p>Nome inválido, tente novamente.`);   
    }
    else {
        document.write(`<p>${nomeCompleto}</p>`);
        document.write(`<p>${nomeCompleto} tem ${nomeCompleto.length} caracteres.</p>`);    
    } 
}