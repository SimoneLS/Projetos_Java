public class ContaCorrente extends Conta implements Tributacao {
	
	public ContaCorrente(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	// Override dos m�todos
	@Override
	public double CalcImposto() {
		return (this.getSaldo() * 0.02);
	}

	@Override
	public void Sacar(double Saque) {
		if(Saque <=0){
			System.out.println("N�o � poss�vel sacar esse valor!");
			return;
		} 
		Saque += 5;
		if (Saque > this.Saldo) {
			System.out.println("Valor de saque digitado � maior que o saldo da conta, lembre-se que h� uma taxa de 5 reais.");
			return;
		}		
		this.Saldo -= Saque;
	}

	@Override
	public void infoConta() {
		System.out.println("Titular da conta: "+ this.getTitularConta());
		System.out.println("N� da ag�ncia: " + this.getAgencia());
		System.out.println("N� da conta: " + this.getNumero());
		System.out.println("Imposto: " + this.CalcImposto());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}
