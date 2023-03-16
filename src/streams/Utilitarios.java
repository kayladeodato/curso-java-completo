package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	//public final static UnaryOperator<String> euforia = n -> n + "!!! ";
	//transformando euforia em fun��o/m�todo:
	public final static String euforia(String n) {
		return n + "!!! ";
	}
	
	/*
	 * D� pra transformar a classe em interface e s� tira o final. Isso significa que o Utilit�rios n�o deve ser instanciada.
	 * Tamb�m pode deixar como classe mas cria-se um contrutor privado:
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
