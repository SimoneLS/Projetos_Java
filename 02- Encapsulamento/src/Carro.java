
public class Carro {

	// Características da classe
    protected String marca;
    protected String portas;
	protected String cor;

	public Carro() {
		this("","","");
	}
	
	//Construtor
	public Carro (String marca, String portas, String cor) {
		this.marca = marca;
		this.portas = portas;
		this.cor = cor;
	}
	
	// Marca do carro
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Quantidade de portas do carro
	public String getPortas() {
		return portas;
	}
	public void setPlaca(String portas) {
		this.portas = portas;
	} 
	
	// Cor do carro
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Função Mostrar
	public void apresentarCarro() {
		System.out.println("Marca do carro: " + this.getMarca());
		System.out.println("Quantidade de portas: " + this.getPortas());
    	System.out.println("Cor do carro: " + this.getCor());	
    	System.out.println(" ");
	}
} 