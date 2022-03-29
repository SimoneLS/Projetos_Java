// Feito por Simone Lopes e Felipe Dourado

public class Animal {
	//Atributos e métodos da SuperClasse
	private int correr;
	private String alimentar;
	private int dormir;
	private String emitirSom;
	
	// Métodos acessores de CORRER
	public int getCorrer() {
		return correr;
	}
	public void setCorrer(int correr) {
		this.correr = correr;
	}
	
	// Métodos acessores de ALIMENTAR
	public String getAlimentar() {
		return alimentar;
	}
	public void setAlimentar(String alimentar) {
		this.alimentar = alimentar;
	}
	
	// Métodos acessores de DORMIR
	public int getDormir() {
		return dormir;
	}
	public void setDormir(int dormir) {
		this.dormir = dormir;
	}
	
	// Métodos acessores de EMITIR SOM
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	//Método para imprimir
	public void Caracteristica () {
		this.getCorrer();
		this.getAlimentar();
		this.getDormir();
		this.getEmitirSom();
	}

}
