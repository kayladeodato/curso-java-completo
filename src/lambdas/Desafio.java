package lambdas;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("Mochila" , 3235.89, 0.50);
		
		
		Function<Produto, Double> precoReal = prod -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? (preco * 1.085) : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000.0 ? preco + 100.00 : preco + 50.00;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		
		String precoFinal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(precoFinal);
		
		/*Fiz dessa forma mas acredito que tenha ferido as boas práticas
		 * 
		 * UnaryOperator<Double> precoReal = prod -> p.preco * (1 - p.desconto);
		Function<Double, Double> imposto = preco -> preco >= 2500 ? (preco * 1.085) : preco;
		Function<Double, Double> frete = preco -> preco >= 3000.0 ? preco + 100.00 : preco + 50.00;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		
		String precoFinal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p.preco);
		
		System.out.println(precoFinal)*/

	}

}
