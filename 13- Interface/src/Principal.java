// Atividade feita por Felipe Dourado e Simone Lopes

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				ContaCorrente InfoCorrente = new ContaCorrente(10, 70, 135.10, "Simone Lopes dos Santos");
				System.out.println("=========================================================");
				InfoCorrente.infoConta();
				System.out.println("=========================================================");
				System.out.println("");
			
				ContaPoupanca InfoPoupanca = new ContaPoupanca(07, 100, 284.50, "Jorginho Dourado de Prata");
				System.out.println("=========================================================");
				InfoPoupanca.infoConta();
				System.out.println("=========================================================");
				System.out.println("");	

				ContaPremium InfoPremium = new ContaPremium(10, 29, 1980.90, "Felipe Dourado Siqueira", 329.0);
				System.out.println("=========================================================");
				InfoPremium.infoConta();
				System.out.println("=========================================================");
				System.out.println("");	
		 }
	}
