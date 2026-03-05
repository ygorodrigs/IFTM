import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in); // Scanner se precisar ler alguma variavel
	    
	    System.out.println("Digite seu nome completo = ");
	    String v1_nome = s.nextLine(); // String e posteriormente line serve para ler texto
	    System.out.println("Digite sua altura"); 
	    double v2_altura =s.nextDouble (); 
	    System.out.println("Digite sua idade = ");
	    int v3_idade = s.nextInt();
	    
        System.out.println("Nome = " + v1_nome);
	    System.out.println("Idade = " + v2_altura);
	    System.out.println("Altura = " + v3_idade);
	}
}
