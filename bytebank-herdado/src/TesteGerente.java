
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		referencia.setSenha(2222);
		
		Gerente g1 = new Gerente();
		g1.setNome("nome do gerente: naab abdusbhds");
		g1.setCpf("14115111");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autenticar(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}

