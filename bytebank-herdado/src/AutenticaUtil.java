
public class AutenticaUtil {

	private int senha;

	public boolean autenticacao(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
