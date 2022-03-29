
public class Pessoa {
	
	// Caracter�sticas da classe
	private String nome;
	private String endereco;
	private String telefone;

	// Fun��o 01
	public Pessoa() {
		this("","","");
	}
	
	//Construtor
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	// Metadados acessores
	
	// NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//ENDERE�O
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	} 
	
	//TELEFONE
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//Fun��o Mostrar
	public void apresentarPessoa() {
	System.out.println("Nome: " + this.getNome());	
	System.out.println("Endere�o: " + this.getEndereco());
	System.out.println("Telefone: " + this.getTelefone());
	}
}