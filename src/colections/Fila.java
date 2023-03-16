package colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adiocionam na fila
		// a diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); // lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		//peek e element -> obtém o próximo elemento da fila (sem remover)
		// a diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		//poll e remove -> obtém o próximo elemento da fila e remove
		// a diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());// lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.size());
		//fila.clear();
		System.out.println(fila.isEmpty());
		System.out.println(fila.contains("Carlos"));
		
		
	}

}
