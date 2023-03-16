package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Porsche ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		//UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> euforia = n -> n + "!!! ";
		
		System.out.println("\n\nCom composi��o...");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::euforia) //refer�ncia de m�todos
			.forEach(print);
		
		//pode-se usar uma classe de Utilit�rios pra n�o precisar criar todas as vezes
	}

}
