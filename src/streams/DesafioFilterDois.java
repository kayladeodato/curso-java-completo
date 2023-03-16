package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import ClassesEMetodos.Produto;

public class DesafioFilterDois {

	public static void main(String[] args) {

		Ecommerce minisystem = new Ecommerce("Radio", 0.15, 20.00);
		Ecommerce notebook = new Ecommerce("Notebook", 0.10, 0.00);
		Ecommerce televisao = new Ecommerce("Televisao", 0.30, 0.00);
		Ecommerce tablet = new Ecommerce("Tablet", 0.30, 0.00);
		
		List<Ecommerce> produtos = Arrays.asList(minisystem, notebook, televisao, tablet);
		
		Predicate<Ecommerce> desconto = a -> a.getDesconto() >= 0.30;
		Predicate<Ecommerce> freteGratis = a -> a.getFrete() <= 0.00;
		Function<Ecommerce, String> mensagem = a -> "Promoção Imperdível! O produto " + a.getProduto() + 
			" está com frete grátis e desconto igual ou maior que 30%! \nGaranta o seu!";
		
		produtos.stream()
			.filter(freteGratis)
			.filter(desconto)
			.map(mensagem)
			.forEach(System.out::println);

	}

}
