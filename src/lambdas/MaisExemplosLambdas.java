package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MaisExemplosLambdas {

	public static void main(String[] args) {
		
		//Fun��es Lambdas com Threads
		Runnable r = () -> System.out.println("Thread com fun��o lambda!");

        new Thread(r).start();
		
		new Thread(() -> System.out.println("Thread com fun��o lambda!")).start(); //Utilizando uma vers�o compacta da fun��o acima
		
		//Fun��es Lambdas com as classes de Collections
		System.out.println("Imprime todos os elementos da lista!");
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		list.forEach(n -> System.out.print(n + " ")); //Tradicionalmente utilizaria o for melhorado
		System.out.println();
		list.forEach(a -> {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
		});
		
		System.out.println("\nOrdenando pessoas pelo nome:");
		
		List<Pessoa> listPessoas = Arrays.asList(new Pessoa("Eduardo", 33), new Pessoa ("Chico", 5), 
				new Pessoa ("Kayla", 32), new Pessoa("Elis", 5));
		
		Collections.sort(listPessoas, (Pessoa pessoa1, Pessoa pessoa2) 
				-> pessoa1.getNome().compareTo(pessoa2.getNome()));

		listPessoas.forEach(p -> System.out.println(p.getNome()));
		
		//M�todos que aceitam fun��es lambda como par�metros
		//Esses s�o os que usam as interfaces funcionais
		
		
		
	}

}
