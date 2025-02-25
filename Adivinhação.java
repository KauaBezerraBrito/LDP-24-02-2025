package Desafios;

import java.util.Scanner;

public class Adivinhação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n_aleatório = (int) (Math.random() * 100) + 1;
		int número;
		
		do {
		
			System.out.print("Digite um número inteiro entre 0 e 100: ");
			número = sc.nextInt();
		
			if (número >= 0 && número <= 100) { 
				
				if (número != n_aleatório) {
			
					if (número > n_aleatório) {
						System.out.println("O número digitado é maior que o número gerado pela máquina. \n");
				
					} else {
						System.out.println("O número digitado é menor que o número gerado pela máquina. \n");
				
					}
				
				} else {
					System.out.print("\nVocê acertou!");
					System.out.print(" O número era " + n_aleatório + ".");
			
				}
				
			} else {
				System.out.println("Número inválido. ");
				
			}
			
		} while (número != n_aleatório);
	
		sc.close();

	}

}
