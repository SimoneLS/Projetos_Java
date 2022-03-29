// Extensão da herança, puxando de funcionário
public class Gerente extends Funcionario {
	
	// Atributos exclusivo da classe Gerente
	private int senha;

	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Método exclusivo da classe Gerente
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else 
			return false;
	}
}