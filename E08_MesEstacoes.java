package lista06;

import java.util.Scanner;

public class E08_MesEstacoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 12:");
		int dado = sc.nextInt();

		switch (dado) {
		case 1:
			System.out.println(dado + "representa o mês de Janeiro, que está na estação do Verão.");
			break;
		case 2:
			System.out.println(dado + "representa o mês de Fevereiro, que está na estação do Verão.");
			break;
		case 3:
			System.out.println(dado + "representa o mês de Março, que está na estação do Verão.");
			break;
		case 4:
			System.out.println(dado + "representa o mês de Abril, que está na estação de Outono.");
			break;
		case 5:
			System.out.println(dado + "representa o mês de Maio, que está na estação de Outono.");
			break;
		case 6:
			System.out.println(dado + "representa o mês de Junho, que está na estação de Outono.");
			break;
		case 7:
			System.out.println(dado + "representa o mês de Julho, que está na estação do Inverno.");
			break;
		case 8:
			System.out.println(dado + "representa o mês de Agosto, que está na estação do Inverno.");
			break;
		case 9:
			System.out.println(dado + "representa o mês de Setembro, que está na estação do Inverno.");
			break;
		case 10:
			System.out.println(dado + "representa o mês de Outubro, que está na estação da Primavera.");
			break;
		case 11:
			System.out.println(dado + "representa o mês de Novembro, que está na estação da Primavera.");
			break;
		case 12:
			System.out.println(dado + "representa o mês de Dezembro, que está na estação da Primavera.");
			break;
		}

		sc.close();
	}
}
