package Desafios;

import java.util.Scanner;

public class Caixa_Eletrônico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caixa Eletrônico");
		System.out.println("1 - Depósito");
		System.out.println("2 - Saque");
		System.out.println("3 - Consulta de saldo");
		
		System.out.print("Digite a opção desejada: ");
		int opção = sc.nextInt();
		
		System.out.print("\nInforme o seu saldo bancário em reais (R$): ");
		float saldo = sc.nextFloat();
		
		
		if (opção == 1) {
			System.out.print("Qual o valor para depósito: ");
			float depósito = sc.nextFloat();
			
			float saldo_atual = saldo + depósito;
			System.out.println("\nValor depositado: R$" + String.format("%.2f" , depósito) + ". \nSaldo atual: R$" + String.format("%.2f", saldo_atual) + ".");
			
		} else if (opção == 2) {
			System.out.print("Qual o valor para saque: ");
			float saque = sc.nextFloat();
			
			float saldo_atual = saldo - saque;
			System.out.println("\nValor sacado: R$" + String.format("%.2f" , saque) + ". \nSaldo atual: R$" + String.format("%.2f", saldo_atual) + ".");
			
		} else if (opção == 3) {
			System.out.println("O valor atual do saldo é de: R$" + saldo + ".");
			
		} else {
			System.out.println("Número inválido.");
			
		} sc.close();
		
	}

}
