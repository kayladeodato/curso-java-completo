package controles;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int soma = 0;
		int quantidadeDigitada = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota: (Digite -1 para sair)");
			nota = sc.nextInt();
			
			if(nota >=0 && nota <=10) {
				soma += nota;
				quantidadeDigitada++;
			} else if (nota != -1){
				System.out.println("Nota informada inválida. Digite novamente: ");
			}
		}
		
		int media = soma/quantidadeDigitada;
		
		System.out.printf("A soma é %d e a quantidade digitada %d e a média %d.", soma, quantidadeDigitada, media);
	}
}
