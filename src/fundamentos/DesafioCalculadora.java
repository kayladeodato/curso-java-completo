package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Insira um número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Insira um número: ");
		double numero2 = sc.nextDouble();
		System.out.println("Insira a operação: ");
		String operacao = sc.next();
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "%".endsWith(operacao) ? numero1 % numero2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operacao, numero2, resultado);
		
		sc.close();
	}
}
