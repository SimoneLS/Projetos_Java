
	import javax.swing.JOptionPane;
		
    public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(null, null);
		
			//Inserir os dados
			p.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: (use ponto 0.00) ")));
			
			// Inserir caixa de sele��o
			Object[] itens= {"//", "N�o estou baixo, estou na m�dia brasileira.", "Amor � como gasolina. Custa caro, acaba r�pido e pode ser substitu�do pelo �lcool.",
			"Estou t�o carente que o churrasqueiro perguntou: '- Cora��o?' e eu respondi '- Oi amor.' ",
			"Nasci sem paci�ncia e sem altura.", "Nem tudo que brilha � de ouro, as vezes sou eu passando",
			"A vida � um len�ol de el�stico. Quando voc� ajeita de um lado, e ele solta do outro.",
			"� hora de esquecer os erros do passado e come�ar a pensar nos erros do futuro.",
			"Se n�o vai dar seta, aponta com o chifre a dire��o que tu vai."};
			
			Object seletedValue = JOptionPane.showInputDialog(null, "Escolha uma frase:", "Frases",
					JOptionPane.INFORMATION_MESSAGE, null,
					itens, itens [0]); //
			
			// Confirmar informa��es
			JOptionPane.showConfirmDialog(null, "Suas informa��es est�o corretas?" + System.lineSeparator() + System.lineSeparator() + "Nome: " + p.getNome()
			+ System.lineSeparator() + "Altura: " + p.getAltura() + System.lineSeparator() + "Frase escolhida:  " + seletedValue + System.lineSeparator());
			
			// Apresentar
			p.apresentarPessoa();
			}

	}

