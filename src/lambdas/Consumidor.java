package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.90, 0.10);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Caderno", 10.90, 0.10);
		Produto p3 = new Produto("Estojo", 25.90, 0.15);
		Produto p4 = new Produto("Mochila", 199.90, 0.25);
		Produto p5 = new Produto("Apontador", 5.90, 0.05);
		
		System.out.println();
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);

	}

}
