
public class Gerente extends Funcionario implements Autenticavel{


	public double getBonificacao() {
		return (super.getSalario() * 0.5) + super.getSalario();
	}

	@Override
	public boolean autenticacao(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}
	
}
