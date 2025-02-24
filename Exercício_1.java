package If_Else;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Aluno(a), qual é a sua nota: ");
		float nota = sc.nextFloat();
		 
		if (nota >= 7 && nota <= 10) {
			System.out.print("Aprovado.");
			 
		} else if (nota < 0 || nota > 10) {
			System.out.print("Nota inválida.");
			
		} else {
			 System.out.print("Reprovado.");
	
		} sc.close();

	}

}
