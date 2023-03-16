package streams;

public class Academia {
	
	private String nome;
	private boolean matriculado;
	private boolean teste30Dias;
	
	public Academia(String nome, boolean matriculado, boolean teste30Dias) {
		this.nome = nome;
		this.matriculado = matriculado;
		this.teste30Dias = teste30Dias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public boolean isTeste30Dias() {
		return teste30Dias;
	}

	public void setTeste30Dias(boolean teste30Dias) {
		this.teste30Dias = teste30Dias;
	}
	
	

}
