package If_Else;

import java.util.Scanner;

public class Exercício_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = sc.nextFloat();
		
		if (n1 > n2) {
			System.out.print("O maior número entre os que foram digitados é " + String.format("%.1f" , n1) + ".");
			
		} else if (n2 > n1) {
			System.out.print("O maior número entre os que foram digitados é " + String.format("%.1f" , n2) + ".");
			
		} else {
			System.out.print("Os números são iguais.");
		
		} sc.close();

	}

}
