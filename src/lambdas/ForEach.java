package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("For Each tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nFor Each com Lambdas #01...");
		aprovados.forEach(nome -> System.out.println(nome + ", "));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nFor Each com Lambdas #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(ForEach::meuImprimir);

	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome � " + nome);
	}

}
