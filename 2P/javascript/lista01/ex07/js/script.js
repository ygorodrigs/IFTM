// Ex07

r = parseInt(prompt(`Vamos construir um RGB\nInforme o valor do R(0 a 255):`))

g = parseInt(prompt(`Informe o valor do G(0 a 255):`))
b = parseInt(prompt(`Informe o valor do B(0 a 255):`))
rgb = `rgb(${r}, ${g}, ${b})`

document.write(`<p style="color: ${rgb};">Fundamentos de Web Design II</p>`)