import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.print("Quantas pizzas foram consumidas? ");
		int v1_quant = s.nextInt();
		System.out.print("Qual o valor de cada pizza? ");
		double v2_valor = s.nextDouble();
		double v4_total = (v1_quant*v2_valor)+8.5;
		System.out.printf("O total a pagar é de R$%.2f", v4_total);

	}
}
