// Feito por Simone Lopes e Felipe Dourado

import java.text.DecimalFormat;

public class Pessoa {
	
	// Atributos da Classe
		private String Nome;
		private Double Altura;
			
    // Deixando os valores em formato decimal
		private DecimalFormat df = new DecimalFormat("0.00");
			
    //Construtor
		public 	Pessoa (String Nome, Double Altura) {
			this.Nome = Nome;
			this.Altura = Altura;
			}
			
			// Métodos acessores do atributo Nome 
			public String getNome() {
				return Nome;
			}
			public void setNome(String Nome) {
				this.Nome = Nome;
			}
			
			// Métodos acessores do atributo Altura
			public Double getAltura() {
				return Altura;
			}
			public void setAltura(Double Altura) {
				this.Altura = Altura;
			}
			
			//Função Imprimir
			public void apresentarPessoa() {
				System.out.println("Nome: " + this.getNome());
		    	System.out.println("Altura: " + df.format(this.getAltura()));	
			}
			
}