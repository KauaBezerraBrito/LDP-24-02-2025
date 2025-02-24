package Desafios;

import java.util.Scanner;

public class Adivinhação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n_aleatório = (int) (Math.random() * 100) + 1;
		
		System.out.print("Digite um número inteiro entre 0 e 100: ");
		int número = sc.nextInt();
		
		if (número != n_aleatório) {
			
			if (número > n_aleatório) {
				System.out.println("O número digitado é maior que o número gerado pela máquina.");
				System.out.println("O número era " + n_aleatório + ".");
				
			} else {
				System.out.println("O número digitado é menor que o número gerado pela máquina.");
				System.out.println("O número era " + n_aleatório + ".");
				
			}
			
		} else {
			System.out.println("Você adivinhou o número!");
			
		} sc.close();
	
	}

}
