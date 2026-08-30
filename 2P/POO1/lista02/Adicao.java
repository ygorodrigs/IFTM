package lista02;

public class Adicao { // (analogia: substantivo)

    public int a, b; // atributos - variaveis que guardam as informações do objeto na memoria (analogia: adjetivos)
    public Adicao(int a, int b) { // metodo construtor, ele é chamado para inicializar os atributos (analogia metodo: verbos)

    this.a = a;
    this.b = b;

    }

    public int somar() {
        return a+b;
    }

}