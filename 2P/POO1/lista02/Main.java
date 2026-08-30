package lista02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int op;

        do {
            System.out.println("___ | MENU | ___");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Encerrar o programa");
            op = s.nextInt();

            int n1, n2;

            switch (op) {
                case 1:
                    n1 = leitura("Informe o primeiro número:", s);
                    n2 = leitura("Informe o segundo número:", s);
                    Adicao ad = new Adicao(n1, n2);
                    System.out.println("O resultado da soma é: " + ad.somar());
                    break;
                case 2:
                    n1 = leitura("Informe o primeiro número:", s);
                    n2 = leitura("Informe o segundo número:", s);
                    Subtracao sub = new Subtracao(n1, n2);
                    System.out.println("O resultado da subtração é: " + sub.subtrair());
                    break;
                case 3:
                    n1 = leitura("Informe o primeiro número:", s);
                    n2 = leitura("Informe o segundo número:", s);
                    Multiplicacao mult = new Multiplicacao(n1, n2);
                    System.out.println("O resultado da multiplicação é: " + mult.multiplicar());
                    break;
                case 4:
                    n1 = leitura("Informe o primeiro número:", s);
                    n2 = leitura("Informe o segundo número:", s);
                    Divisao div = new Divisao(n1, n2);
                    System.out.println("O resultado da divisão é" + div.dividir());
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (op != 5);
    }

    public static int leitura(String mensagem, Scanner s) {
        System.out.println(mensagem);
        return s.nextInt();
    }
}
