//Extens�o da heran�a, puxando de Cliente
public class ClientePremium extends Cliente{
	
	// Atributos da classe ClientePremium s�o herdados da classe Cliente
	
	// Modificamos o m�todo com valores diferentes
	public static double calcularDesconto (double valor) {
		return (valor / 100 * 85);
	}
	
}
