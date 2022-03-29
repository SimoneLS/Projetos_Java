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
		System.out.println("N� da ag�ncia: " + this.getAgencia());
		System.out.println("N� da conta: " + this.getNumero());
		System.out.println("Rendimento da Poupan�a: " + this.RendimentoPoupanca());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}
