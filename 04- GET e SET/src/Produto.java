// Feito por Felipe Dourado e Simone Lopes.

// Exercício 02

public class Produto {

		//Atributos
		private String nome;
		private Double precoCusto;
		private Double precoVenda;
		private Double margemLucro;
		
		// Construtor
		public Produto (String nome, Double precoCusto, Double precoVenda, Double margemLucro) {
			this.nome = nome;
			this.precoCusto = precoCusto; 
			this.precoVenda = precoVenda;
			this.margemLucro = margemLucro;
			}

		//Nome do produto com GET e SET
		public String getNome() {
		     return nome;
		}
		public void setNome(String Nome) {
		     this.nome = Nome;
		}
		
		//Preço de custo do produto com GET e SET
		public Double getprecoCusto() {
		     return precoCusto;
		}

		public void SetprecoCusto(Double precoCusto) {
		     this.precoCusto = precoCusto;
		}
		
		// Preço de venda do produto com GET e SET
		public Double getprecoVenda() {
		    if (precoVenda >= precoCusto){
		    }else{ System.out.println("O preço de venda é inferior ou igual ao que foi comprado."); };
		    return precoVenda;
		}

		public void SetprecoVenda(Double precoVenda) {
		     this.precoVenda = precoVenda;
		}
		     
		//Margem de lucro do produto com GET e SET
		public Double getmargemlucro () {
		     return margemLucro;
		    }

	    public void SetmargemLucro(Double margemLucro) {
		     this.margemLucro = margemLucro;
		    }
	    
	    
	    public double getcalcularMargemLucro() {
	        return margemLucro = precoVenda - precoCusto; 
	        }
	      
	     
	     public double getMargemLucroPorcentagem() {
	 		double getMargemLucroPorcentagem = (this.margemLucro / this.precoVenda * 100);
	 		return getMargemLucroPorcentagem;
	}
	     
			public void apresentarProduto() {
			System.out.printf("Nome do produto: " + getNome());
			System.out.println("");
			System.out.printf("Custo do produto: " + getprecoCusto());
			System.out.println("");
			System.out.printf("Preço do produto: " + getprecoVenda());
			System.out.println("");
			System.out.printf("Margem de lucro do produto: " + getcalcularMargemLucro());
			System.out.println("");
			System.out.printf("Percentual da margem de lucro: " + getMargemLucroPorcentagem());
			
		}

	}