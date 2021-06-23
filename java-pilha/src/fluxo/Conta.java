package fluxo;

public class Conta {

	public static void main(String[] args) {

		System.out.println("Estamos aqui.");
		for (int i = 0; i < 5; i++) {
			
			try {
				System.out.println(i);
				int a = i / 0;
				
			} catch (ArithmeticException ex) {
//				String msg = ex.getMessage();
//				System.out.println("ArithmeticException" + msg);
				ex.getCause();
			}
		}

	}

}
