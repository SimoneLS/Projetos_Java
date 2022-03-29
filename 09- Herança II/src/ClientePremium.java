//Extensão da herança, puxando de Cliente
public class ClientePremium extends Cliente{
	
	// Atributos da classe ClientePremium são herdados da classe Cliente
	
	// Modificamos o método com valores diferentes
	public static double calcularDesconto (double valor) {
		return (valor / 100 * 85);
	}
	
}
