package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidade;
	int variacao = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidade + variacao > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += variacao;
		}
		
	}
	
	void frear() {
		if(velocidade >= variacao) {
			velocidade -= variacao;
		} else {
			velocidade = 0;
		}
		
	}

}
