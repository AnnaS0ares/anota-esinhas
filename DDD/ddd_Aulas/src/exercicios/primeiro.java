package exercicios;
import java.util.Scanner; 


//1- Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. 

public class primeiro {
	public static void main(String[] args) {
	     
		Scanner entrada = new Scanner(System.in);
		int valorX, valorY;
		double produto;
				
		
		System.out.println(	"Valor de X: ");
		valorX= entrada.nextInt();
		System.out.println("Valor de Y: ");
		valorY= entrada.nextInt();
		
		produto = (valorX * valorY);
		
		System.out.println("produto" + produto);
		
		
	}

}
