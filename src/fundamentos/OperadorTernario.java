package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double media = 5.6;
		
		String resultado1 = media >=7 ? "Aprovado" : "Em recupera��o";
		
		System.out.println(resultado1);
		
		//Pode-se usar um tern�rio em uma vari�vel tamb�m:
		
		String resultadoParcial = media >= 5.0 ? "Em recupera��o" : "Reprovado";
		String resultadoFinal = media >=7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println(resultadoFinal);
		
		//Ainda podemos deixar o operador tern�rio dentro de outro operador tern�rio:
		
		String resultado2 = media >=7.0 ? "Aprovado" : media >= 5.0 ? "Em recupera��o" : "Reprovado";
		System.out.println(resultado2);
	}
}
