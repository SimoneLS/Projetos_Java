import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Sobrecarga numero = new Sobrecarga();
		
		//Inserimos as v�riaveis
		int array[];
		int numeros;
		
			//O usu�rio insere os dados 
			numeros = (Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros voc� quer analisar? ")));
			array = new int[numeros];
			
			for (int counter = 0; counter < numeros; counter++) {
			array[counter] = (Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (counter + 1) +"� n�mero: ")));
			}
			
			// Imprimir resultado
			numero.imprimirPrimo(numero.Primo(array), array);	
	}
}