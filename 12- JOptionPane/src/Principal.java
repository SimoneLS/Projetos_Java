
	import javax.swing.JOptionPane;
		
    public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(null, null);
		
			//Inserir os dados
			p.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: (use ponto 0.00) ")));
			
			// Inserir caixa de seleção
			Object[] itens= {"//", "Não estou baixo, estou na média brasileira.", "Amor é como gasolina. Custa caro, acaba rápido e pode ser substituído pelo álcool.",
			"Estou tão carente que o churrasqueiro perguntou: '- Coração?' e eu respondi '- Oi amor.' ",
			"Nasci sem paciência e sem altura.", "Nem tudo que brilha é de ouro, as vezes sou eu passando",
			"A vida é um lençol de elástico. Quando você ajeita de um lado, e ele solta do outro.",
			"É hora de esquecer os erros do passado e começar a pensar nos erros do futuro.",
			"Se não vai dar seta, aponta com o chifre a direção que tu vai."};
			
			Object seletedValue = JOptionPane.showInputDialog(null, "Escolha uma frase:", "Frases",
					JOptionPane.INFORMATION_MESSAGE, null,
					itens, itens [0]); //
			
			// Confirmar informações
			JOptionPane.showConfirmDialog(null, "Suas informações estão corretas?" + System.lineSeparator() + System.lineSeparator() + "Nome: " + p.getNome()
			+ System.lineSeparator() + "Altura: " + p.getAltura() + System.lineSeparator() + "Frase escolhida:  " + seletedValue + System.lineSeparator());
			
			// Apresentar
			p.apresentarPessoa();
			}

	}

