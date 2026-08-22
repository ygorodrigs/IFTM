nomeCompleto = prompt(`Informe seu nome completo:`);
if (nomeCompleto != null) {
  if (nomeCompleto == "") {
    alert(`Nome inválido, tente novamente.`);
  } else {
    // 1º passo: transformar tudo p/ letras minusculas, posteriormente transforma a string em um vetor

    nomeCompleto = nomeCompleto.toLowerCase().split(" "); //split "quebra" a variavel, ela vira varias

    // 2º passo:  converter a primeira palavra em maiscula
    nomeCompleto[0] = nomeCompleto[0].toUpperCase();

    // 3º passo: converter o vetor p/ string

    nomeCompleto = nomeCompleto.join(" "); // metodo join p/ juntar
    alert(nomeCompleto); //
  }
}
