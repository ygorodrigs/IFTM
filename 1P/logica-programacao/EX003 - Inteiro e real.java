import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Ano de lançamento do jogo: ");
	    int v1_ano = s.nextInt();
	    s.nextLine();
	    System.out.print("Nome do jogo: ");
	    String v2_jogo = s.nextLine();
	    System.out.print("Preço: ");
	    double v3_preco = s.nextDouble();
	    System.out.print("O jogo " + v2_jogo + ", lançado em " + v1_ano + ", custa R$ " + v3_preco);
	   
	}
}
