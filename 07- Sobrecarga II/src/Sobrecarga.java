// Feito por Felipe Dourado e Simone Lopes

public class Sobrecarga {
	
	// Identificamos o n�mero primo
	public boolean Primo(int number) {
		if (number > 1) {
			for(int cont = 2; cont<number; cont++) {
				if (number % cont == 0 && number != 2) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	//Sobrecarga
	public boolean[] Primo(int[] array) {
		boolean[] listIsEven = new boolean[array.length];
		
		for (int column = 0; column < array.length; column++) {
			if (array[column]>1) {
				
				listIsEven[column] = true;
				
				for(int cont = 2; cont<array[column]; cont++) {
					if (array[column] % cont == 0 && array[column] != 2) {
						listIsEven[column] = false;
						break;
					}
				}
			
			} else {
				listIsEven[column] = false;
			}
		}
		return listIsEven;
	}

	// Apresentar valores
	public void imprimirPrimo(boolean[] answerIsPrimeNumber, int[] number) {
		for (int column = 0; column < answerIsPrimeNumber.length; column++) {
			if (answerIsPrimeNumber[column]) {
				System.out.printf("%nO n�mero %d � primo", number[column]);
			} else {
				System.out.printf("%nO n�mero %d n�o � primo", number[column]);
			}
		}
	}
}