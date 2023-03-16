package colections;

import java.util.Objects;

import arrays.EqualsHashcode;

public class Usuario {
	
	String nome;
	
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	//fazendo de forma manual os hashCode e equals:
	
	/*public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
		Usuario outroUsuario = (Usuario)obj;
		return this.nome.equals(outroUsuario.nome);
	}*/
	
	

}
