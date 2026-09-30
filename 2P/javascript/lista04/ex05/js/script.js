/* 5) Crie um vetor de objetos para armazenar usuários (usuário e senha) e salve-os localmente no
navegador (via localStorage). O cadastro dessas informações deve ser feito diretamente via código,
sem o uso de formulários na interface. */

users = { usuarios: [
    {usuario: "Ygor", senha: "123"}, 
    {usuario: "Nicolas", senha: 789}]
};

localStorage.setItem("users", JSON.stringify(users));

/* para guardar um vetor (varios dados), a anatomia é objeto -> vetor -> objeto */