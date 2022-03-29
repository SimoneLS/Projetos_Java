	// Atividade feita por Felipe Dourado e Simone Lopes 

    // Exercício 01

	public class Animal {

		// Atributos da Classe
		private String Nome;
	    private String Especie;
	    private String Patas;
		private String Peso;
		

		public Animal() {
			this("","","","");
		}
		
		//Construtor
		public Animal (String Nome, String Especie, String Patas, String Peso) {
			this.Nome = Nome;
			this.Especie = Especie;
			this.Patas = Patas;
			this.Peso = Peso;
		}
		
		// Nome do animal com GET e SET
		public String getNome() {
			return Nome;
		}
		public void setNome(String Nome) {
			this.Nome = Nome;
		}
		
		// Espécie do animal com GET e SET
		public String getEspecie() {
			return Especie;
		}
		public void setEspecie(String Especie) {
			this.Especie = Especie;
		}
		
		// Quantidade de patas do animal com GET e SET
		public String getPatas() {
			return Patas;
		}
		public void setPatas(String Patas) {
			this.Patas = Patas;
		} 
		
		// Peso do animal com GET e SET
		public String getPeso() {
			return Peso;
		}
		public void setPeso(String Peso) {
			this.Peso = Peso;
		}
		
		//Função Mostrar
		public void apresentarAnimal() {
			System.out.println("Animal: " + this.getNome());
			System.out.println("Espécie do animal: " + this.getEspecie());
			System.out.println("Quantidade de patas: " + this.getPatas());
	    	System.out.println("Peso do animal: " + this.getPeso());	
		}
	}
