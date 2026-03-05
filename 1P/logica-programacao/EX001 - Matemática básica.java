import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Digite um número = ");
	    int n1 = s.nextInt();
	    System.out.println("Digite outro número = ");
        int n2 = s.nextInt();

	    int soma = n1+n2;
	    int mult = n1*n2;
	    int sub = n1-n2;
	    int div1 = n1/n2;
	    double div2 = (double) n1/n2;
	    
	    System.out.println("Soma = " + soma);
	    System.out.println("Multiplicação = " + mult);
	    System.out.println("Subtração = " + sub);
	    System.out.println("Divisão inteira = " + div1);
	    System.out.printf("Divisão real = %.4f", div2);

	}
	
}
