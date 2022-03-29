import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Produto p = new Produto (null, null, null, null);
		
		System.out.printf("Digite o nome do produto:  ");
		p.setNome(scan.nextLine());
		
		System.out.printf("Digite o custo do produto:  ");
		p.SetprecoCusto(scan.nextDouble());
		
		System.out.printf("Digite o preço do produto: ");
		p.SetprecoVenda(scan.nextDouble());
		
		p.apresentarProduto();
		
		scan.close();
		
	}

}
