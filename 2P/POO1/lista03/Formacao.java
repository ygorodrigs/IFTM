package lista03;

public class Formacao { // Formacao é uma classe (molde/planta), ele só vira objeto quando há o new

    public String nivel; // são os atributos
    public boolean concluido;
    public String instituicao;
    public int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano) {
        this.nivel = nivel; // this.nivel: refere-se ao atributo que pertence a "este" (this) objeto.
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }
}
