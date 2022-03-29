
	public class Principal {

		public static void main (String[] args) {
		// Instanciamos para ter acesso a classe Funcionario
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Simone");
		f1.setCpf("1111.2222.3");
		f1.setSalario(3500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		// Instanciamos para ter acesso a classe Gerente
		Gerente g1 = new Gerente();
		
		g1.setNome("PEDRO");
		g1.setCpf("3223232323");
		g1.setSalario(3000);
		g1.setSenha(2222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(2222));
		
		
	}

}