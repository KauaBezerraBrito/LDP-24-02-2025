package If_Else;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o ano que deseja saber se é bissexto ou não: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.print("O ano " + ano + " é bissexto.");
		
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		
		} sc.close();

	}

}
