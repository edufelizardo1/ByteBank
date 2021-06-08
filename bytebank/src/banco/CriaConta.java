package banco;

public class CriaConta {

	public static void main(String[] args) {

		Cliente primeiroCliente = new Cliente();
		
		primeiroCliente.nome = "Cesar Araujo";
		primeiroCliente.cpf = "222.222.222-22";
		primeiroCliente.profissao = "Programador";
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 2000;
		primeiraConta.agencia = 222;
		primeiraConta.numero = 123;
		primeiraConta.titular = primeiroCliente;
		
		System.out.println(primeiraConta.titular.nome);
		System.out.println(primeiraConta.titular.cpf);
		System.out.println(primeiraConta.titular.profissao);
		
		
	}

}
