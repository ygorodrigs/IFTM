import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 
	 System.out.print("Digite um número inteiro com 3 dígitos: ");
	 int v1 = s.nextInt ();
	 int v2 = v1/100;
	 int v3 = (v1%100)/10;
	 int v4 = (v1%100)%10;
	 
	 System.out.println("O número informado de forma invertida é: " + v4 + v3 + v2);

	}
}
