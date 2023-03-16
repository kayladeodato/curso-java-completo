package arrays;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome); //Comparando o objeto com as atribui��es.
			boolean emailIgual = outro.email.equals(this.email); 
			
			return nomeIgual && emailIgual;	
		} else {
			return false;
		}
		
	}

}
