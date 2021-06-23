
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		return (super.getSalario() * 0.5) + super.getSalario();
	}

	private AutenticaUtil autenticador;

	public Gerente() {
		this.autenticador  = new AutenticaUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autenticacao(senha);
		
	}

}
