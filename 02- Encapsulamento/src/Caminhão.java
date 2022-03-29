
public class Caminhão {
	// Características da classe
    private String marca;
    private String tamanho;
	private String pneus;
	

	public Caminhão() {
		this("","","");
	}
	
	//Construtor
	public Caminhão (String marca, String tamanho, String pneus) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.pneus = pneus;
	}
	
	// Marca do caminhão
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Tamanho do caminhão
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	} 
	
	// Quantidade de pneus do caminhão 
	public String getPneus() {
		return pneus;
	}
	public void setPneus(String pneus) {
		this.pneus = pneus;
	}
	
	//Função Mostrar
	public void apresentarCaminhão() {
		System.out.println("Marca do caminhão: " + this.getMarca());
		System.out.println("Comprimento do caminhão: " + this.getTamanho());
    	System.out.println("Quantidade de pneus: " + this.getPneus());	
	}
}
