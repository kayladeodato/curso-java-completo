package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(5.1, 8.0));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};

		System.out.println(resultado.apply(5.1, 8.0));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		//É mais adequado fazer composição de funções para a possibilidade de reuso.
		//Na função resultado ficou tudo em um mesmo lugar ficando dificil pegar só a media por exemplo.
		
		System.out.println(media.andThen(conceito).apply(9.5, 5.0));
	}

}
