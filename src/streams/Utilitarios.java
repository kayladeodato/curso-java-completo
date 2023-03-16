package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	//public final static UnaryOperator<String> euforia = n -> n + "!!! ";
	//transformando euforia em função/método:
	public final static String euforia(String n) {
		return n + "!!! ";
	}
	
	/*
	 * Dá pra transformar a classe em interface e só tira o final. Isso significa que o Utilitários não deve ser instanciada.
	 * Também pode deixar como classe mas cria-se um contrutor privado:
	 * 
	 * 	private Utilitarios() {
	 * }
	 * 
	 * 	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		public final static String euforia(String n) {
		return n + "!!! ";
	 * 
	 */

}
