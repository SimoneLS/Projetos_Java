public class ContaPremium extends Conta implements Tributacao {
	
	private double Credito;

	public ContaPremium(int Numero, int Agencia, double Saldo, String TitularConta, double Credito) {
		super(Numero, Agencia, Saldo, TitularConta);
		this.Credito = Credito;
	}

	public double getCredito() {
		return Credito;
	}

	public void setCredito(double Credito) {
		this.Credito = Credito;
	}

	@Override
	public double CalcImposto() {
		return (this.getSaldo() * 0.01);
	}

	@Override
	public void infoConta() {
		System.out.println("Titular da conta: " + this.getTitularConta());
		System.out.println("Nº da agência: " + this.getAgencia());
		System.out.println("Nº da conta: " + this.getNumero());
		System.out.println("Imposto: " + this.CalcImposto());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Crédito: " + this.getCredito());
	}
}