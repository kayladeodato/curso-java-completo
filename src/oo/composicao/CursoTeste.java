package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria");
		Aluno aluno2 = new Aluno("Márcio");
		Aluno aluno3 = new Aluno("João");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);

	}

}
