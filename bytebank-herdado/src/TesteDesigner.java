
public class TesteDesigner {
	public static void main(String[] args) {
		Designer d1 = new Designer();
		d1.setNome("Marcos");
		d1.setCpf("333.333.333-33");
		d1.setSalario(2000.0);
		
		System.out.println(d1.getNome());
		System.out.println(d1.getCpf());
		System.out.println(d1.getSalario());
		
		System.out.println(d1.getBonificacao());
	}
}
