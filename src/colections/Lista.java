package colections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		//ArrayList<Usuario> lista = new ArrayList<>(); 
		List<Usuario> lista = new ArrayList<>();
		
		Usuario usuario = new Usuario("Paula");
		lista.add(usuario);
		
		// outra forma de adicionar elementos na lista:
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Paulo"));
		lista.add(new Usuario("Bruna"));
		lista.add(new Usuario("Marcos"));
		
		System.out.println(lista.get(3));
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}

	}

}
