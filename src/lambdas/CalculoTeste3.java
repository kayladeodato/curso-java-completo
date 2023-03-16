package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> operacao = (x, y) -> {
			return x + y;
			//double a = x + y; return a; 
			//permite v�rias linhas de c�digo
		};
		System.out.println(operacao.apply(3.0, 5.0));
		
		//vers�o reduzida de uma lambda, sem as chaves. Por�m s� aceita uma linha de c�digo
		operacao = (x, y) -> x * y;
		
		System.out.println(operacao.apply(8.0, 2.0));
	
	}

}
