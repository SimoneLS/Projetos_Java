import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Sobrecarga numero = new Sobrecarga();
		
		//Inserimos as váriaveis
		int array[];
		int numeros;
		
			//O usuário insere os dados 
			numeros = (Integer.parseInt(JOptionPane.showInputDialog("Quantos números você quer analisar? ")));
			array = new int[numeros];
			
			for (int counter = 0; counter < numeros; counter++) {
			array[counter] = (Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) +"º número: ")));
			}
			
			// Imprimir resultado
			numero.imprimirPrimo(numero.Primo(array), array);	
	}
}