package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		//Usando o andThen irá seguir a ordem: maisDois -> vezesDois -> aoQuadrado
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);
		
		//Já o compose irá fazer o caminho reverso: aoQuadrado -> vezesDois -> maisDois
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);

	}

}
