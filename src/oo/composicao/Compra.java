package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Produto> itens = new ArrayList<Produto>();
	
	void adicionarItem(Produto item) {
		itens.add(item);
		item.compra = this;
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Produto item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}

}
