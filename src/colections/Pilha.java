package colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.add("Don Quixote");
		livros.add("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); // lança uma exceção
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove()); // lança uma exceção
		
		livros.size();
		// livros.clear();
		livros.contains("Batman");
		livros.isEmpty();
	}
}
