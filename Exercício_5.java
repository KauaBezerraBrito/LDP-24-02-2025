package If_Else;

import java.util.Scanner;

public class Exercício_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número desejado para verificar se é positivo, negativo ou igual a zero: ");
		float número = sc.nextFloat();
		
		if (número > 0) { 
			System.out.print("O número " + String.format("%.1f" , número) + " é positivo.");
			
		} else if (número < 0) { 
			System.out.print("O número " + String.format("%.1f" , número) + " é negativo.");
			
		} else { 
			System.out.print("O número " + String.format("%.1f" , número) + " é igual a zero.");
			
		} sc.close();

	}

}
