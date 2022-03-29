// Feito por Simone Lopes
// Criamos a clase "pai"

public class Cliente {
	private String nome;
	private int idade;
	protected String endereco;
	protected int descontos;
	
	// Métodos acessores do atributo nome 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Métodos acessores do atributo idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// Métodos acessores do atributo endereço
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	// Métodos acessores do atributo descontos
	public int getDescontos() {
		return descontos;
	}
	public void setDescontos(int descontos) {
		this.descontos = descontos;
	}
	
	// Método de calcular o desconto do cliente
	public static double calcularDesconto (double valor) {
		return (valor / 100 * 90);
	}
}
