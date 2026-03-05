import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Informe, em metros, a altura da parede: ");
	    Double v1_altura = s.nextDouble();
	    System.out.print("Informe, em metros, a largura da parede: ");
        Double v2_largura = s.nextDouble();
        Double v3_area = (Double) v1_altura*v2_largura;
        System.out.printf("A área total da parede é: %.2f m². ", v3_area);
        Double v4_azulejos = 1.5;
        Double v5_total = (Double) v3_area/v4_azulejos; 
        System.out.printf("Para essa parede, é necessário %.2f azulejos.", v5_total);
	}
}
