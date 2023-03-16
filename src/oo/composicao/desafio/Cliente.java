package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compras> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compras compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compras compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}

}
