package exercicios;
import java.util.Scanner; 



/*Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
/expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3). Você pode trocar esses números por variáveis.*/




public class segundo{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valorBase, valorExpoente;
		double potencia;
		
		System.out.println(	"Valor da base: ");
		valorBase= entrada.nextInt();
		System.out.println(	"Valor do expoente: ");
		valorExpoente= entrada.nextInt();
		
		potencia = Math.pow(valorBase, valorExpoente);
		System.out.println("potencia" + potencia);
	}

}
