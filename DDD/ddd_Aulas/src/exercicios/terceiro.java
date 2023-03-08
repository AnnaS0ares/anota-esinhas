package exercicios;
import java.util.Scanner; 

/*Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
de um número A é representado por A2 = A * A.*/


public class terceiro {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	int valorX, valorY;
	float produto1;
	float produto2;
    float soma;
			
	
	System.out.println(	"Valor de X: ");
	valorX= entrada.nextInt();
	System.out.println("Valor de Y: ");
	valorY= entrada.nextInt();
	
	produto1 = (valorX * valorX);
	produto2 = (valorY * valorY);
	soma = (produto1 + produto2);
	
	
	
	System.out.println("soma" + soma);
			
		
			
			
			
		}

}
