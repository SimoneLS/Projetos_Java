public class ContaCorrente extends Conta implements Tributacao {
	
	public ContaCorrente(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	// Override dos métodos
	@Override
	public double CalcImposto() {
		return (this.getSaldo() * 0.02);
	}

	@Override
	public void Sacar(double Saque) {
		if(Saque <=0){
			System.out.println("Não é possível sacar esse valor!");
			return;
		} 
		Saque += 5;
		if (Saque > this.Saldo) {
			System.out.println("Valor de saque digitado é maior que o saldo da conta, lembre-se que há uma taxa de 5 reais.");
			return;
		}		
		this.Saldo -= Saque;
	}

	@Override
	public void infoConta() {
		System.out.println("Titular da conta: "+ this.getTitularConta());
		System.out.println("Nº da agência: " + this.getAgencia());
		System.out.println("Nº da conta: " + this.getNumero());
		System.out.println("Imposto: " + this.CalcImposto());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}
