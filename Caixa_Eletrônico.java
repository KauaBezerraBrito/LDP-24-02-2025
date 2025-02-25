package Desafios;

import java.util.Scanner;

public class Caixa_Eletrônico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opção;
		float saldo, saldo_atual;
		
		System.out.println("===Caixa Eletrônico===");
		System.out.println("=======Digite:=======");
		System.out.println("    1 - Depósito    ");
		System.out.println("     2 - Saque"      );
		System.out.println("3 - Consulta de saldo");
		System.out.println("      4 - Sair      ");
		
		do {
			
			System.out.print("Digite a opção desejada: ");
			opção = sc.nextInt();
			
			saldo = 0;
			
			switch (opção) {
			
			case 1:
				System.out.print("\nQual o valor para depósito: ");
				float depósito = sc.nextFloat();
				
				saldo_atual = saldo + depósito;
				System.out.print("Valor depositado: R$" + String.format("%.2f" , depósito) + ". \nSaldo atual: R$" + String.format("%.2f", saldo_atual) + ". \n");
				break;
			
			case 2:
				System.out.print("\nQual o valor para saque: ");
				float saque = sc.nextFloat();
			
				saldo_atual = saldo - saque;
				System.out.println("\nValor sacado: R$" + String.format("%.2f" , saque) + ". \nSaldo atual: R$" + String.format("%.2f", saldo_atual) + ". \n");
				break;
			
			case 3:
				System.out.print("\nInforme o seu saldo bancário em reais (R$): ");
				saldo = sc.nextFloat();
				
				System.out.println("O valor atual do saldo é de: R$" + saldo + ".");
				break;
			
			case 4:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Número inválido.");
			}	
			
			} while (opção >= 1 && opção < 4);
				
		sc.close();

	}
	
}
