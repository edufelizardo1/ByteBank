
public class Gerente extends FuncionarioAutenticavel{


	public double getBonificacao() {
		return (super.getSalario() * 0.5) + super.getSalario();
	}
	
}
