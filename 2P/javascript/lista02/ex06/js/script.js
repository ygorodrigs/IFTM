texto = prompt("Informe um texto qualquer:").split(" ");
if (texto.length < 2) {
  alert("É necessário que o texto tenha pelo menos duas palavras.");
} else {
  alert(`${texto[0]} ${texto[texto.length - 1]}`);
}
