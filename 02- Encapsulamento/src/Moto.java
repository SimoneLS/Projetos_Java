
public class Moto {
	// Características da classe
	    String marca;
	    String placa;
		String cor;

		public Moto() {
			this("","","");
		}
		
		//Construtor
		public Moto (String marca, String placa, String cor) {
			this.marca = marca;
			this.placa = placa;
			this.cor = cor;
		}
		
		// Marca da moto
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		// Placa da moto
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		} 
		
		// Cor da moto
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		//Função Mostrar
		public void apresentarMoto() {
			System.out.println("Marca da moto: " + this.getMarca());
			System.out.println("Placa da moto: " + this.getPlaca());
	    	System.out.println("Cor da moto: " + this.getCor());	
	    	System.out.println(" ");
		}
	}