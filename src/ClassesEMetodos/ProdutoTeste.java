package ClassesEMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto.nome = "caneta";
		Produto.preco = 8.99;
		
		System.out.println(Produto.precoComDesconto());

	}

}
