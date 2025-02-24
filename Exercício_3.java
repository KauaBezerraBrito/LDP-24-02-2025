package If_Else;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		float n3 = sc.nextFloat();
		
		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.print("Os números organizados em ordem crescente: " + n3 + ", " + n2 + ", " + n1 + ".");
		
		} else if (n1 > n2 && n1 > n3 && n2 < n3) {
			System.out.print("Os números organizados em ordem crescente: " + n2 + ", " + n3 + ", " + n1 + ".");
		
		} else if (n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.print("Os números organizados em ordem crescente: " + n3 + ", " + n1 + ", " + n2 + ".");
			
		} else if (n2 > n1 && n2 > n3 && n1 < n3) {
			System.out.print("Os números organizados em ordem crescente: " + n1 + ", " + n3 + ", " + n2 + ".");
			
		} else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.print("Os números organizados em ordem crescente: " + n2 + ", " + n1 + ", " + n3 + ".");
			
		} else if (n3 > n1 && n3 > n2 && n1 < n2) {
			System.out.print("Os números organizados em ordem crescente: " + n1 + ", " + n2 + ", " + n3 + ".");
			
		} else {
			System.out.print("Há números repetidos.");
			
		} sc.close();

	}

}
