package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Chico", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Roberto", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		/*
		 * No distinct precisa implementar os métodos equals and hashcode pra poder tirar as duplicidades
		 */
		
		System.out.println("\nskip/limit");
		alunos.stream().skip(2).limit(9).forEach(System.out::println);
		
		/*
		 * No skip/limit vai de um ponto escolhido em skip até um limite definido em limit
		 */
		
		System.out.println("\ntakeWhile");
		alunos.stream().skip(5).takeWhile(a -> a.nota >= 7).forEach(System.out::println);

		/*
		 * No takeWhile faça alguma coisa até que a condição seja atendida, 
		 * o takeWhile vai interromper a execução no primeiro elemento que não satisfazer a condição
		 */
	}

}
