
public class TesteEditorVideo {
	public static void main(String[] args) {
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Marcos");
		ev1.setCpf("333.333.333-33");
		ev1.setSalario(1800.0);
		
		System.out.println(ev1.getNome());
		System.out.println(ev1.getCpf());
		System.out.println(ev1.getSalario());
		
		System.out.println(ev1.getBonificacao());
	}
}
