package academia;

public class Academia {
    private int alunos;
    static int acessos; // Atributo default e estático (conforme o diagrama)

    public Academia() {
        this.alunos = 0;
    }

    public void atualiza(int n) {
        this.alunos += n;
    }

    public int getAlunos() {
        return this.alunos;
    }

    public static int getAcessos() {
        return acessos;
    }

    public static void adicionaAcesso() {
        acessos++;
    }
}