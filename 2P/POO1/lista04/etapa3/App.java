package etapa3;

import java.util.Scanner;

public class App {
    public static Scanner s = new Scanner(System.in);

    public static double leCoordenada(int ponto) {
        System.out.print("Digite o valor da coordenada " + ponto + ": ");
        return s.nextDouble();
    }

    public static void main(String[] args) {
        char op; 

        do { 
            System.out.println("\n___ | Calculo de retas | ___");
            System.out.println();

            double x1 = leCoordenada(1);
            double y1 = leCoordenada(2);
            double x2 = leCoordenada(3);
            double y2 = leCoordenada(4); 

            if (Validacao.valida(x1, x2, y1, y2)) {
                Retas r1 = new Retas(x1, y1, x2, y2);
                System.out.println();
                System.out.println(r1.exibe());
                System.out.printf("O comprimento da reta é: %.2f\n", r1.comprimento());
                System.out.println("Total de retas válidas cadastradas: " + Retas.contador);
            } else {
                System.out.println();
                System.out.println("Coordenadas inválidas! Os pontos devem pertencer ao 1º quadrante (> 0).");
            }

            System.out.print("\nDeseja calcular outra reta? (S/N): ");
            op = s.next().toUpperCase().charAt(0);

        } while (op == 'S');

        System.out.println("Programa finalizado.");
    }
}