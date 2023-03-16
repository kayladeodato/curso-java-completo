package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro1 = new Civic();
		
		carro1.acelerar();
		System.out.println(carro1.velocidade);
		carro1.frear();
		System.out.println(carro1.velocidade);
		
		Ferrari carro2 = new Ferrari(200);
		
		carro2.acelerar();
		System.out.println(carro2.velocidade);
		carro2.frear();
		System.out.println(carro2.velocidade);
		

	}

}
