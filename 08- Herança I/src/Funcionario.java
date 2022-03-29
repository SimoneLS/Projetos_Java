
public class Funcionario {

	private String nome;
	private String cpf;
	protected int salario;

	// GET e SET do nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	// GET e SET do cpf
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// GET e SET do sal�rio
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}

	// M�todo de bonifica��o do sal�rio
	public double getBonificacao() {
		return salario * 1.10;
	}
}

