package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra = new Compra();
		compra.cliente = "Chico";
		//compra.itens.add(new Produto("Caneta", 5, 1.50));
		//compra.itens.add(new Produto("Borracha", 1, 1.00));
		//compra.itens.add(new Produto("Caderno", 2, 5.00));
		//compra.itens.add(new Produto("Grampeador", 1, 8.00));
		
		compra.adicionarItem(new Produto("Borracha", 1, 1.00));;
		compra.adicionarItem(new Produto("Borracha", 1, 1.00));
		compra.adicionarItem(new Produto("Caderno", 2, 5.00));
		compra.adicionarItem(new Produto("Grampeador", 1, 8.00));
		
		System.out.println(compra.itens.size());
		
		System.out.println(compra.valorTotal());
		

	}

}
