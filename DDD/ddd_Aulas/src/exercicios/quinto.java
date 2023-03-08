package exercicios;
import java.util.Scanner; 


/* Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L. */


public class quinto {
	public static void main(String[] args) {
	     
		Scanner entrada = new Scanner(System.in);
		int valorL;
		double area;
		
		System.out.println(	"Valor de L: ");
		valorL= entrada.nextInt();
		
		area = (valorL * valorL);
		
		
		System.out.println("Área" + area);

	}
}
