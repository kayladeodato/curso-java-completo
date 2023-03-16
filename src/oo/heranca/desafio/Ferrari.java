package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari() {
		this(315);
	}
	
	Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		variacao = 15;
	}
	
	/*void acelerar() {
		velocidade += 15;
	}
	
	void frear() {
		if(velocidade >= 15) {
			velocidade -= 15;
		} else {
			velocidade = 0;
		}
		
	}*/ 
	// opcional por conta da variacao, irá chamar os metodos do Carro mas substituindo com a variação da Ferrari

}
