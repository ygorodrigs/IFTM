package AppSobrecarga;

import java.util.Scanner;

public class AppSobrecarga {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int op = 0;

        do {
            System.out.print("___| Menu |___\n\n");
            System.out.println("1 - Círculo");
            System.out.println("2 - Triângulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");
            // System.out.print();
            
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe a primeira coordenada (X): ");
                    double xcentro = s.nextDouble();
                    System.out.print("Informe a segunda coordenada (Y): ");
                    double ycentro = s.nextDouble();
                    System.out.print("Informe o raio: ");
                    double raio = s.nextDouble();
                    Circulo c = new Circulo(xcentro, ycentro, raio);
                    System.out.println(c.exibe() + "\n");
                break;
                
                case 2:
                    System.out.print("Informe a base do triângulo: ");
                    double base = s.nextDouble();
                    System.out.print("Informe a altura do triângulo: ");
                    double altura = s.nextDouble();
                    Triangulo t = new Triangulo(base, altura);
                    System.out.println(t.exibe());
                break;

                case 3:
                    System.out.print("Informe valor do lado: \n");
                    double lado = s.nextDouble();
                    Quadrado q = new Quadrado(lado);
                    System.out.println(q.exibe());        
                break;
                
                case 4:
                    System.out.println("Programa finalizado.");

                break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                break;
            }

        } while (op!=4);

        s.close();
    }
}
