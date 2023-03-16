package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo operacao = (x, y) -> {
			return x + y;
			//double a = x + y; return a; 
			//permite v�rias linhas de c�digo
		};
		System.out.println(operacao.calculo(3, 5));
		
		//vers�o reduzida de uma lambda, sem as chaves. Por�m s� aceita uma linha de c�digo
		operacao = (x, y) -> x * y;
		
		System.out.println(operacao.calculo(8, 2));
		
		System.out.println(operacao.legal());
		
		System.out.println(Calculo.muitoLegal());
	
	}

}
