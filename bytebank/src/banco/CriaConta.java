package banco;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();

		primeiraConta.saldo = 200;
		primeiraConta.agencia = 210;
		primeiraConta.numero = 234;
		primeiraConta.titular = "Araujo";

		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Número: " + primeiraConta.numero);
		System.out.println("Títular: " + primeiraConta.titular);

		primeiraConta.deposita(200);

		System.out.println("Saldo: " + primeiraConta.saldo);

		primeiraConta.sacar(50);

		System.out.println("Saldo: " + primeiraConta.saldo);

		primeiraConta.sacar(350);

		System.out.println("Saldo: " + primeiraConta.saldo);

		primeiraConta.sacar(50);

		System.out.println(primeiraConta.statusOperaccao(primeiraConta.sacar(50)));
		System.out.println("Saldo: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();

		segundaConta.saldo = 1200;
		segundaConta.agencia = 220;
		segundaConta.numero = 244;
		segundaConta.titular = "Maria";
		
		System.out.println();
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Agência: " + segundaConta.agencia);
		System.out.println("Número: " + segundaConta.numero);
		System.out.println("Títular: " + segundaConta.titular);
		
		segundaConta.transfere(300, primeiraConta);
		System.out.println();
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println();
		System.out.println("Saldo: " + primeiraConta.saldo);
	}

}
