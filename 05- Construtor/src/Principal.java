import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Pessoa p = new Pessoa (null, null, null);
		
		System.out.printf("Digite o seu nome:  ");
		p.setNome(scan.nextLine());
		
		System.out.printf("Digite sua data de nascimento: ");
		p.setDataNascimento(scan.nextLine());
		
		System.out.printf("Digite o ano que você nasceu:  ");
		p.setNascimento(scan.nextInt());
		
		System.out.printf("Digite a sua altura: ");
		p.SetAltura(scan.nextDouble());
		
		p.apresentarIdade();
		
		scan.close();
	
	}

}
