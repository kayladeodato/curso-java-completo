package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> operacao = (x, y) -> {
			return x + y;
			//double a = x + y; return a; 
			//permite várias linhas de código
		};
		System.out.println(operacao.apply(3.0, 5.0));
		
		//versão reduzida de uma lambda, sem as chaves. Porém só aceita uma linha de código
		operacao = (x, y) -> x * y;
		
		System.out.println(operacao.apply(8.0, 2.0));
	
	}

}
