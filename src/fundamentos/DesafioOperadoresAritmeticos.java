package fundamentos;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double superiorA = numA/denA;
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		double superiorB = Math.pow((numB/denB), 2);
		double inferior = Math.pow(10, 3);
		double superior = Math.pow((superiorA-superiorB), 3);
		
		double operacao = superior/inferior;
		
		System.out.println(operacao);
	}
}
