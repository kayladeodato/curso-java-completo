package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo operacao = (x, y) -> {
			return x + y;
			//double a = x + y; return a; 
			//permite várias linhas de código
		};
		System.out.println(operacao.calculo(3, 5));
		
		//versão reduzida de uma lambda, sem as chaves. Porém só aceita uma linha de código
		operacao = (x, y) -> x * y;
		
		System.out.println(operacao.calculo(8, 2));
		
		System.out.println(operacao.legal());
		
		System.out.println(Calculo.muitoLegal());
	
	}

}
