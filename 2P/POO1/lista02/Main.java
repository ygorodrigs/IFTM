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
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Encerrar o programa");
            op = s.nextInt();

            switch(op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        while (op != 0);
    }
}