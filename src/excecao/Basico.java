package excecao;

public class Basico {

	public static void main(String[] args) {
		
		try {
			System.out.println(7 / 0);
		} catch(ArithmeticException e) {
			System.out.println("Opera��o n�o permitida");
		}

	}

}
