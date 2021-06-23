
public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

	private AutenticaUtil autenticador;

	public Administrador() {
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
