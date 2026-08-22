nomeCompleto = prompt(`Informe seu nome completo:`).trim();
if (nomeCompleto != null) {
    if (nomeCompleto == "") {
        alert(`Nome inválido, tente novamente.`);
        }
    else {
        alert(nomeCompleto.toUpperCase());
    }
} 

