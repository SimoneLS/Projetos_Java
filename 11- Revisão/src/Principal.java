
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcion�rio Pedro = new Funcion�rio();
		Funcion�rio Vagner = new Funcion�rio();

		Pedro.Nome = "Pedro Santos";
		Pedro.SalarioBruto = 2000;
		Pedro.Imposto = 200;
		
		System.out.println("O Sal�rio total do Pedro � R$" +Pedro.SalarioBruto);
		Pedro.SalarioLiquido();
		
		System.out.println("Descontado o Imposto, o sal�rio de Pedro � R$" + Pedro.Resultado(0));
		Pedro.Aumento = 1900;
		
		System.out.println("Ap�s o aumento, o sal�rio de Pedro � R$" + Pedro.Aumento);
		
		

		Vagner.Nome = "Vagner Santana";
		Vagner.SalarioBruto = 2500;
		Vagner.Imposto = 370; 
		
		System.out.println("O sal�rio total do Vagner � R$" + Vagner.SalarioBruto);
		Vagner.SalarioLiquido();
		
		System.out.println("Descontado o Imposto, o sal�rio de Vagner � R$" + Vagner.Resultado(0));
		Vagner.Aumento = 2200;
		
		System.out.println("Ap�s aumento, o sal�rio de Vagner � R$" + Vagner.Aumento);
		
	}

}
