
package aulaUm;
import java.util.Scanner;



public class exemplo1 {
	public static void main(String[] args) {
		
		
		Scanner imp = new Scanner(System.in);
		int valorX, valorY, valorW;
		double media;
		
		
		System.out.println(	"Valor de X: ");
		valorX= imp.nextInt();
		System.out.println("Valor de Y: ");
		valorY= imp.nextInt();
		System.out.println("Valor de W: ");
		valorW= imp.nextInt();
		
		
	      media = (valorX + valorY + valorW /3);
		
		System.out.println("A media aritimetica é " + media);
	}
	

}
