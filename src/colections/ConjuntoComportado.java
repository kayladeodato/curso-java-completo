package colections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<>();
		lista.add("Chico");
		lista.add("Elis");
		lista.add("Abel");
		
		System.out.println(lista);
		
		// Irá organizar a lista de gatos:
		SortedSet<String> gatos = new TreeSet<String>();
		
		gatos.add("Chico");
		gatos.add("Elis");
		gatos.add("Abel");
		
		System.out.println(gatos);

	}

}
