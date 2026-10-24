package aplicacao;

public class Aluno {
    private String codigo;
    private String nome;
    private String telefone;
    private int acessos;
    int categoria; // Atributo default

    public Aluno(String codigo, String nome, String telefone, int acessos, int categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = acessos;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }

    public String exibe1() {
        return String.format("Código: %s\nNome: %s\nTelefone: %s\nCategoria: %d\n",
                codigo, nome, telefone, categoria);
    }

    public String exibe2(int acessos) {
        return String.format("Código: %s\nNome: %s\nTelefone: %s\nCategoria: %d\nAcessos: %d\n",
                codigo, nome, telefone, categoria, acessos);
    }
}