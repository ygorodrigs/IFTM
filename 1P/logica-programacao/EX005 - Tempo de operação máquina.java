import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	   System.out.print("Informe, em segundos, o tempo de operação da máquina: ");
	   int v1_segundos = s.nextInt();
	   int v2_horas = v1_segundos/3600; // horas inteira 
	   int v3_minutos = (v1_segundos%3600)/60; // minutos resto
	   int v4_segundos = v1_segundos%60; // segundos resto
	   System.out.println("O tempo de operação da máquina é: " + v2_horas + 
	   ":" + v3_minutos + ":" + v4_segundos + ". Respectivamente: horas, minutos e segundos.");
	}
}
