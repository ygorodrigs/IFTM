// Ex 04

let nota = []

nota[0] = parseFloat(prompt("Informe suas nota do 1º bimestre:"))
nota[1] = parseFloat(prompt("Informe suas nota do 2º bimestre:"))

notaFinal = (nota[0] + nota[1]) / 2

if (notaFinal >= 60.0) {
    alert(`Você foi aprovado com média ${notaFinal}.`)
}

else {
    alert(`Você foi reprovado com média ${notaFinal}, faltando ${60-notaFinal} pontos para passar.`)
}