// Feito por Simone Lopes e Felipe Dourado

public class Animal {
	//Atributos e m�todos da SuperClasse
	private int correr;
	private String alimentar;
	private int dormir;
	private String emitirSom;
	
	// M�todos acessores de CORRER
	public int getCorrer() {
		return correr;
	}
	public void setCorrer(int correr) {
		this.correr = correr;
	}
	
	// M�todos acessores de ALIMENTAR
	public String getAlimentar() {
		return alimentar;
	}
	public void setAlimentar(String alimentar) {
		this.alimentar = alimentar;
	}
	
	// M�todos acessores de DORMIR
	public int getDormir() {
		return dormir;
	}
	public void setDormir(int dormir) {
		this.dormir = dormir;
	}
	
	// M�todos acessores de EMITIR SOM
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	//M�todo para imprimir
	public void Caracteristica () {
		this.getCorrer();
		this.getAlimentar();
		this.getDormir();
		this.getEmitirSom();
	}

}
