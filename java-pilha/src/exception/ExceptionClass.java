package exception;

public class ExceptionClass {

	public static void main(String[] args) {

		System.out.println("Estamos aqui.");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				
				int a = i / 0;
				
			} catch (ArithmeticException ex) {
				System.out.println("ArithmeticException");
			}
		}

	}

}
