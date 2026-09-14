package lista02;

public class Divisao {
    public double a, b;
    public Divisao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double dividir() {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!"); // a interação com o usuário é mais usual fazer no Main, separar essa parte
            return 0;
        }
        return (double) a/b;
    }
}
