package lista03;

public class Formacao { // Formacao é o objeto

    public String nivel; // são os atributos
    public boolean concluido;
    public String instituicao;
    public int ano;

    public Formacao(String nivel, boolean concluido, String instituicao, int ano) {
        this.nivel = nivel;
        this.concluido = concluido;
        this.instituicao = instituicao;
        this.ano = ano;
    }
}
