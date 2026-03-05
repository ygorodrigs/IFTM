import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	 
	 System.out.print("Informe o valor que você gastou no restaurante: ");
	 double v1_valor = s.nextDouble ();
	 double v2_taxa = (double)v1_valor*0.1;
	 double v3_total = (double)v1_valor+v2_taxa;
	 System.out.printf("Os 10%% da taxa de serviço é R$ %.2f\n", v2_taxa);
	 System.out.printf("Desta forma, o valor total a pagar é R$ %.2f", v3_total);
	}
}
