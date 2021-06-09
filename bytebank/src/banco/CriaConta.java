package banco;

public class CriaConta {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("André Araujo");
		cliente1.setCpf("222.222.222-22");
		cliente1.setProfissao("Programador");
		
		Conta conta1 = new Conta();
		
		conta1.setTitular(cliente1);
		
		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta1.getTitular().getCpf());
		System.out.println(conta1.getTitular().getProfissao());
		
		
		conta1.getTitular().setProfissao("Manicure");
		
		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta1.getTitular().getCpf());
		System.out.println(conta1.getTitular().getProfissao());
	}

}
