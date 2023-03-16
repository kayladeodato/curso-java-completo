package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 85;
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("°C = (°F - 32) x 5/9");
		System.out.println("°C = " + celsius);
	}

}
