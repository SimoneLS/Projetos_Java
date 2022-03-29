public abstract class Conta {

	// Atributos
	private	int	Numero;
	private	int	Agencia;
	protected	double	Saldo;
	private	String	TitularConta;

	//Métodos
	public Conta(int Numero, int Agencia, double Saldo, String TitularConta) {
		this.Numero = Numero;
		this.Agencia = Agencia;
		this.Saldo = Saldo;
		this.TitularConta = TitularConta;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int Numero){
		this.Numero = Numero;
	}

	public int getAgencia() {
		return Agencia;
	}

	public void setAgencia(int Agencia){
		this.Agencia = Agencia;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double Saldo){
		this.Saldo = Saldo;
	}

	public String getTitularConta() {
		return TitularConta;
	}

	public void setTitularConta(String TitularConta){
		this.TitularConta = TitularConta;
	}

	public void Sacar(double Saque) {
		return;
	}

	public void Depositar() {
	}

	public void infoConta() {
	}	
}