package lista06;

import java.util.Scanner;

public class E03_Calculadora1 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2° valor: ");
		int numero2 = sc.nextInt();
		System.out.println("Qual operação deseja realizar: "
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão");
		int escolha = sc.nextInt();
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		float divisao = numero1 / numero2;
		
		switch (escolha) {
		case 1:
			System.out.println("O resultado da soma é: " + soma + ".");
			break;
		case 2:
			System.out.println("O resultado da subtração é: " + subtracao + ".");
			break;
		case 3:
			System.out.println("O resultado da multiplicação é: " + multiplicacao + ".");
			break;
		case 4:
			System.out.println("O resultado da divisão é: " + divisao + ".");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		sc.close();
}
}
