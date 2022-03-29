
	import java.text.DecimalFormat;
	 
		public class Funcionario {
	private String Nome;
	private String Cpf;
	private double Salario;
	
	// Deixando os valores em formato decimal
	private DecimalFormat df = new DecimalFormat("#,###.00");
	
	// Atributos com GET
	public String getNome() {
		return this.Nome;
	}
	public String getCpf() {
		return this.Cpf;
	}
	public double getSalario() {
		return this.Salario;
	}
	
	//Sobrecarga
	public String getSalario(String cifrao) {
	String Salario = cifrao + df.format(this.Salario);
	Salario = Salario.replace('.', '-');
	Salario = Salario.replace(',', '.');
	Salario = Salario.replace('-', ',');
	return Salario;
	}
	
	//Atributos com SET
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	
	// Imprimir
		public void ApresentarFuncionario() {
	System.out.println("Seu nome: " + this.getNome());
	System.out.println("Seu CPF: " + this.getCpf());
	System.out.println("Seu Salário: " + this.getSalario());
	System.out.println("Seu salário com cifrão: " + this.getSalario("R$"));
	}
	}
