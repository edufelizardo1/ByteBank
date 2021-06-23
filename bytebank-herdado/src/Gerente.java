
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;

	public double getBonificacao() {
		return (super.getSalario() * 0.5) + super.getSalario();
	}

	@Override
	public boolean autenticacao(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
