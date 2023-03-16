package colections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {

		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ricardo");
		usuarios.put(2, "Monica");
		usuarios.put(3, "Maisa");
		usuarios.put(12, "Luma");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //mostra só as chaves
		System.out.println(usuarios.values()); // mostra só os valores
		System.out.println(usuarios.entrySet()); // mostra as chaves e valores
		
		System.out.println(usuarios.containsKey(3)); 
		System.out.println(usuarios.containsValue("Luma"));
		
		System.out.println(usuarios.get(3)); // retorna o valor com essa chave
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue() + " ");
		}

	}

}
