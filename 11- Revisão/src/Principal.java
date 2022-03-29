
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionário Pedro = new Funcionário();
		Funcionário Vagner = new Funcionário();

		Pedro.Nome = "Pedro Santos";
		Pedro.SalarioBruto = 2000;
		Pedro.Imposto = 200;
		
		System.out.println("O Salário total do Pedro é R$" +Pedro.SalarioBruto);
		Pedro.SalarioLiquido();
		
		System.out.println("Descontado o Imposto, o salário de Pedro é R$" + Pedro.Resultado(0));
		Pedro.Aumento = 1900;
		
		System.out.println("Após o aumento, o salário de Pedro é R$" + Pedro.Aumento);
		
		

		Vagner.Nome = "Vagner Santana";
		Vagner.SalarioBruto = 2500;
		Vagner.Imposto = 370; 
		
		System.out.println("O salário total do Vagner é R$" + Vagner.SalarioBruto);
		Vagner.SalarioLiquido();
		
		System.out.println("Descontado o Imposto, o salário de Vagner é R$" + Vagner.Resultado(0));
		Vagner.Aumento = 2200;
		
		System.out.println("Após aumento, o salário de Vagner é R$" + Vagner.Aumento);
		
	}

}
