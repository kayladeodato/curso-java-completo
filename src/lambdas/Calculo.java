package lambdas;

public interface Calculo {
	
	double calculo(double a, double b);
	
	default String legal() {
		return "Que legal!";
	}
	
	static String muitoLegal() {
		return "Muito legal!";
	}

}
