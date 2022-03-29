
import java.util.Scanner;
 
	public class Principal {
 
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor de compra para o cliente comum: ");
		System.out.println("O desconto para cliente comum é de 10%. Valor total: R$ " + Cliente.calcularDesconto(scan.nextDouble()));
	
		System.out.print("Digite o valor de compra para o cliente Premium: ");
		System.out.println("O desconto para cliente premium é de 15%. Valor total: R$ " + ClientePremium.calcularDesconto(scan.nextDouble()));
	
	scan.close();
	}
		}