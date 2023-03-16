package colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adiocionam na fila
		// a diferen�a � o comportamento ocorre quando a fila est� cheia!
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); // lan�a uma exce��o
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		//peek e element -> obt�m o pr�ximo elemento da fila (sem remover)
		// a diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o
		System.out.println(fila.element());
		
		//poll e remove -> obt�m o pr�ximo elemento da fila e remove
		// a diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());// lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.size());
		//fila.clear();
		System.out.println(fila.isEmpty());
		System.out.println(fila.contains("Carlos"));
		
		
	}

}
