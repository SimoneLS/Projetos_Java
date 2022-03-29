
public class Pessoa {

	//Atributos
			private String nome;
			private int nascimento;
			private double altura;
			private String dataNascimento;
			
			// Construtor
			public Pessoa(Object nome2, Object object, Object object2) {}
			public Pessoa (String nome, int nascimento, String dataNascimento, double altura) {
				this.nome = nome;
				this.nascimento = nascimento; 
				this.altura = altura;
			}

			//Nome da pessoa com GET e SET
			public String getNome() {
			     return nome;
			}
			public void setNome(String Nome) {
			     this.nome = Nome;
			}
			
			//Ano de nascimento da pessoa com GET e SET
			public int getNascimento() {
			     return nascimento;
			}

			public void setNascimento(int Nascimento) {
			     this.nascimento = Nascimento;
			}
			
			//Data de nascimento da pessoa com GET e SET
			public String getDataNascimento() {
				return dataNascimento;
			}
			public void setDataNascimento(String dataNascimento) {
				this.dataNascimento = dataNascimento;
			}
			
			// altura da pessoa com GET e SET
			public double getAltura() {
			    return altura;
			}

			public void SetAltura(double altura) {
			     this.altura = altura;
			}
			
			 public int getcalcularIdade() {
			        return nascimento = 2021 - nascimento; 
			        }
			     
				public void apresentarIdade() {	
			    System.out.println("");
				System.out.printf("Olá " + getNome() + ", você tem " + getcalcularIdade() + " anos!");	
			}
}
