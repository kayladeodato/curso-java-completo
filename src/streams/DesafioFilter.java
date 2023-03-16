package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Academia aluno1 = new Academia("Marcos", false, true);
		Academia aluno2 = new Academia("Ana", true, false);
		Academia aluno3 = new Academia("Junior", false, false);
		Academia aluno4 = new Academia("Tom", false, false);
		Academia aluno5 = new Academia("Silas", true, true);
		Academia aluno6 = new Academia("Lina", false, false);
		
		List<Academia> alunos  = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
		
		Predicate<Academia> matriculado = a -> a.isMatriculado() == false;
		Predicate<Academia> testeExpirado = a -> a.isTeste30Dias() == false;
		Function<Academia, String> mensagem = a -> "Olá, " + a.getNome() + " seu teste de 30 dias expirou. "
				+ "Será necessário realizar a matrícula para acessar os equipamentos";
		
		alunos.stream()
			.filter(matriculado)
			.filter(testeExpirado)
			.map(mensagem)
			.forEach(System.out::println);
				

	}

}
