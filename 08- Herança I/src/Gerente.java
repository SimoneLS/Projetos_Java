// Extens�o da heran�a, puxando de funcion�rio
public class Gerente extends Funcionario {
	
	// Atributos exclusivo da classe Gerente
	private int senha;

	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// M�todo exclusivo da classe Gerente
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else 
			return false;
	}
}