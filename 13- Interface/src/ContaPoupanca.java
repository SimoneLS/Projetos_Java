public class ContaPoupanca extends Conta {

	public ContaPoupanca(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	public double RendimentoPoupanca(){
		return this.getSaldo() * 0.05;
	}
	
	@Override
	public void infoConta() {
		System.out.println("Titular da conta: " + this.getTitularConta());
		System.out.println("Nº da agência: " + this.getAgencia());
		System.out.println("Nº da conta: " + this.getNumero());
		System.out.println("Rendimento da Poupança: " + this.RendimentoPoupanca());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}
