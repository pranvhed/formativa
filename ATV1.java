package AVfomativa;
import java.util.Scanner;
public class ATV1 {

	public static void main(String[] args) {
		
		double celsius,fahrenheit;		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o grau em farenheit: ");
		fahrenheit = ler.nextDouble();
		celsius=((fahrenheit - 32)*5)/9;
		
		System.out.print(" A temperatura convertida em celsius é: " + celsius);
       
	}

}
