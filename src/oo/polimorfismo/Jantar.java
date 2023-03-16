package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(55);
		
		Comida ingrediente1 = new Arroz(0.300);
		Comida ingrediente2 = new Feijao(0.200);
		Comida ingrediente3 = new Sorvete(0.300);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		System.out.println(convidado.getPeso());

	}

}
