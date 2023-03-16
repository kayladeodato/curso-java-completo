package lambdas;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class OutroDesafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de números que deseja analisar: ");
		int informaNumero = scanner.nextInt();
		
		for(int i = 0; i < informaNumero; i++) {
			System.out.println("Insira a ação que deseja realizar: 1-Par/Ímpar,  2-Primo, 3-Palíndromo)");
			int escolhaAcao = scanner.nextInt();
				if(escolhaAcao == 1) {
					System.out.println("Insira o número que deseja verificar: ");
					int numero = scanner.nextInt();
					Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
					System.out.println(parOuImpar.apply(numero));
				
			} else if(escolhaAcao == 2) {
				System.out.println("Insira o número que deseja verificar: ");
				int numero = scanner.nextInt();
				int quantidadeDivisao = 0;
				
				for(int j = 1; j < numero; j++) {
					if(numero % j == 0) {
						quantidadeDivisao++;
					}
						
				}
				Function<Integer, String> primo = num -> num > 2 ? "Composto" : "Primo";
				System.out.println(primo.apply(quantidadeDivisao));
				
			} else if (escolhaAcao == 3) {
				System.out.println("Insira o número que deseja verificar: ");
				int numero = scanner.nextInt();
				
				
			} else {
				System.out.println("Opção inválida.");
			}
		}
		
		
		scanner.close();

	}

}
