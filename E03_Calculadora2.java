package lista06;

import java.util.Scanner;

public class E03_Calculadora2 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2° valor: ");
		int numero2 = sc.nextInt();
		System.out.println("Qual operação deseja realizar: ");
		char operacao = sc.next().charAt(0);
		float resultado;
		
		switch (operacao) {
		case '+':
			resultado = numero1 + numero2;
			System.out.println("O resultado é: " + resultado);
			break;
		case '-':
			resultado = numero1 - numero2;
			System.out.println("O resultado é: " + resultado);
			break;
		case '*':
			resultado = numero1 * numero2;
			System.out.println("O resultado é: " + resultado);
			break;
		case '/':
			resultado = numero1 / numero2;
			System.out.println("O resultado é: " + resultado);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		sc.close();
}
}
