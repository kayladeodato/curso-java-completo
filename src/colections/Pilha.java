package colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno pr�ncipe");
		livros.add("Don Quixote");
		livros.add("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); // lan�a uma exce��o
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove()); // lan�a uma exce��o
		
		livros.size();
		// livros.clear();
		livros.contains("Batman");
		livros.isEmpty();
	}
}
