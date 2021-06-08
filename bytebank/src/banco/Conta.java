package banco;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public String statusOperaccao(boolean sacar) {
		if(sacar == true) {
			return "Opera��o realizada com sucesso.";
		} else {
			return "N�o foi poss�vel realizar a opera��o.";
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}
