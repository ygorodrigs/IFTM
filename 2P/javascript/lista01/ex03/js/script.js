// Ex03

nome = prompt("Informe seu nome completo:")
idade = parseInt (prompt("Informe sua idade:"))
idadeRestante = 18 - idade
if (idade >= 18)
    alert(`${nome}, você já POSSUI idade para tirar carteira.`)
else
    alert(`${nome}, você ainda não possui idade para tirar carteira, ainda falta(m)${idadeRestante} anos`)


