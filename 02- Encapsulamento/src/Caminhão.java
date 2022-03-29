
public class Caminh�o {
	// Caracter�sticas da classe
    private String marca;
    private String tamanho;
	private String pneus;
	

	public Caminh�o() {
		this("","","");
	}
	
	//Construtor
	public Caminh�o (String marca, String tamanho, String pneus) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.pneus = pneus;
	}
	
	// Marca do caminh�o
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Tamanho do caminh�o
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	} 
	
	// Quantidade de pneus do caminh�o 
	public String getPneus() {
		return pneus;
	}
	public void setPneus(String pneus) {
		this.pneus = pneus;
	}
	
	//Fun��o Mostrar
	public void apresentarCaminh�o() {
		System.out.println("Marca do caminh�o: " + this.getMarca());
		System.out.println("Comprimento do caminh�o: " + this.getTamanho());
    	System.out.println("Quantidade de pneus: " + this.getPneus());	
	}
}
