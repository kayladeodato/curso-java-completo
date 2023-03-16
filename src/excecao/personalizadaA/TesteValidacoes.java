package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) throws IllegalAccessException {
		
		Aluno aluno = new Aluno("", 7);
		
		Validar.aluno(aluno);
		
		System.out.println("Fim");

	}

}
