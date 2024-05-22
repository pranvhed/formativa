package AVfomativa;
import java.util.Scanner;
public class ATV2 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Insira o comprimento do lado do quadrado: ");
	        
	        double comprimentolateral = scanner.nextDouble();
	        double area = comprimentolateral * comprimentolateral;
	        
	        System.out.println("A area do quadrado é: " + area);
	        scanner.close();

	}

}
