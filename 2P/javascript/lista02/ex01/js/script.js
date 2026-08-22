nome = prompt("Digite seu primeiro nome:");
sobrenome = prompt("Digite seu sobrenome:");
n = parseInt(prompt("Digite a quantidade de vezes (N):"));
corUsuario = prompt("Digite a cor para o nome (ex: red, blue, #FF0000):");

nomeCompleto = nome + " " + sobrenome;

for (let i = 1; i <= n; i++) {
    // Alterna: ímpar (1º, 3º...) = preto | par (2º, 4º...) = cor do usuário
    let corLinha = (i % 2 !== 0) ? "black" : corUsuario;
    document.write("<p style='color: " + corLinha + ";'>" + i + " " + nomeCompleto + "</p>");
}