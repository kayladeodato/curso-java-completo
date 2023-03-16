package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String numero1 = sc.next().replace(",",".");
		
		System.out.println("Digite um número: ");
		String numero2 = sc.next().replace(",",".");
		
		System.out.println("Digite um número: ");
		String numero3 = sc.next().replace(",",".");
		
		double novoNumero1 = Double.parseDouble(numero1);
		double novoNumero2 = Double.parseDouble(numero2);
		double novoNumero3 = Double.parseDouble(numero3);
		
		double soma = novoNumero1 + novoNumero2 + novoNumero3;
		double media = soma/3;
		
		System.out.println("A soma dos números informados é: " + soma);
		System.out.println("A média dos números informados é: " + media);
		
		sc.close();
	}

}
