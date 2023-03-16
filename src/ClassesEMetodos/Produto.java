package ClassesEMetodos;

public class Produto {
	
	static String nome;
	static double preco;
	static double desconto = 0.25;
	
	
	static double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
