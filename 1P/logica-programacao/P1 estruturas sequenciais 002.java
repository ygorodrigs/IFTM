import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.print("Informe o valor de saque solicitado: ");
		int v1_valor = s.nextInt();
		int v2_valor = v1_valor/50;
		int v3_valor = (v1_valor%50)/10;
		System.out.println("Notas de 50: " + v2_valor);
		System.out.println("Notas de 10: " + v3_valor);

	}
}
