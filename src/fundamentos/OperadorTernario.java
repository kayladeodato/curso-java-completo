package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
		double media = 5.6;
		
		String resultado1 = media >=7 ? "Aprovado" : "Em recuperação";
		
		System.out.println(resultado1);
		
		//Pode-se usar um ternário em uma variável também:
		
		String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
		String resultadoFinal = media >=7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println(resultadoFinal);
		
		//Ainda podemos deixar o operador ternário dentro de outro operador ternário:
		
		String resultado2 = media >=7.0 ? "Aprovado" : media >= 5.0 ? "Em recuperação" : "Reprovado";
		System.out.println(resultado2);
	}
}
