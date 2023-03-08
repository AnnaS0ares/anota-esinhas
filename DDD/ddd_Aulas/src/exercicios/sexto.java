package exercicios;
import java.util.Scanner; 
import java.text.NumberFormat;



/* Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B. 

*
*
*/
public class sexto {
	
	
	
	// exercicio A
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Float valorA, valorB,valorC;
	Float area;
			
	
	System.out.println(	"Valor de A: ");
	valorA= entrada.nextFloat();
	System.out.println("Valor de B: ");
	valorB= entrada.nextFloat();
	System.out.println("Valor de C: ");
	valorC= entrada.nextFloat();
	
	area = (valorA * valorC/2);
	
	System.out.println("area do triangulo " + area);
	
}
}
	
		

   
