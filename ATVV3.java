package AVfomativa;
import java.util.Scanner;
public class ATVV3 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double valor, valor2, resultado = 0;
	 String operacao;
		        
		        System.out.print("Informe o primeiro valor: ");
		        valor = ler.nextDouble();
		        
		        System.out.print("Informe o segundo valor: ");
		        valor2 = ler.nextDouble();
		        
		        System.out.print("Informe a operação desejada (+ ou *): ");
		        operacao = ler.next();
		        
		        if (operacao.equals("+")) {
		            resultado = valor + valor2;
		        } else if (operacao.equals("*")) {
		            resultado = valor * valor2;
		        } else {
		            System.out.println("Operação inválida!");
		            ler.close();
		            return;
		        }
		        
		        System.out.println("O resultado é: " + resultado);
		        ler.close();
		    }
		}

			