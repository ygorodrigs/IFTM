// O recurso de armazenamento do navegador só aceita dados no formato de texto (string). A função JSON.stringify() converte o objeto JavaScript em uma string formatada como JSON

user = { usuario: "Ygor", senha: "123456"} // aqui foi criado o objeto user, que vai armazenar os atributos

localStorage.setItem("user",  JSON.stringify(user)) // se não usar o JSON.stringify será exibidido como: [objeto]