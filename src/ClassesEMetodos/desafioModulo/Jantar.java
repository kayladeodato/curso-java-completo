package ClassesEMetodos.desafioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Susie", 60.3);
		
		Comida comida1 = new Comida("macarrão", 0.223);
		Comida comida2 = new Comida("arroz", 0.150);
		Comida comida3 = new Comida("feijão", 0.350);
		
		System.out.println(pessoa.apresentar());
		
		pessoa.comer(comida1);
		System.out.println(pessoa.apresentar());
		
		pessoa.comer(comida2);
		System.out.println(pessoa.apresentar());
		
		pessoa.comer(comida3);
		System.out.println(pessoa.apresentar());
		
		
	}

}
