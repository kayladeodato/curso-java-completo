package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		//forma tradicional
		Calculo operacao = new Somar();
		System.out.println(operacao.calculo(10, 8));
		
		operacao = new Multiplicar();
		System.out.println(operacao.calculo(10, 8));
	}

}
