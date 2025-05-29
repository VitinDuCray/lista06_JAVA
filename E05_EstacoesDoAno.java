package lista06;

import java.util.Scanner;

public class E05_EstacoesDoAno {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Estações do Ano"
				+ "\n1 - Verão"
				+ "\n2 - Outono"
				+ "\n3 - Inverno"
				+ "\n4 - Primavera"
				+ "\nSelecione uma opção:");
		int estacoes = sc.nextInt();
		
		switch (estacoes) {
		case 1:
			System.out.println("A estação do ano selecionada é verão");
			break;	
		case 2:
			System.out.println("A estação do ano selecionada é outono");
			break;	
		case 3:
			System.out.println("A estação do ano selecionada é inverno");
			break;
		case 4:
			System.out.println("A estação do ano selecionada é primavera");
			break;
		default:
			System.out.println("Opção Inválida.");
		}
		sc.close();
	}
}
