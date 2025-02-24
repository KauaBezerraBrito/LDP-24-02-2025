package Desafios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da sua massa corporal em Kilogramas (kg): ");
		float massa_corporal = sc.nextFloat();
		
		System.out.print("Digite a sua altura em Metros (m): ");
		float altura = sc.nextFloat();
		
		float IMC = massa_corporal / (altura * altura);
		
		if (IMC < 18.5) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de magreza.");
		
		} else if (IMC > 18.5 && IMC < 24.9) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de normal.");
		
		} else if (IMC > 25 && IMC < 29.9) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de sobrepeso.");
		
		} else if (IMC > 30 && IMC < 34.9) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de obesidade grau 1.");
		
		} else if (IMC > 35 && IMC < 39.9) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de obesidade grau 2.");
		
		} else if (IMC > 40) {
			System.out.print("\nSeu IMC é de: " + String.format("%.2f" , IMC) + ". " + "Isso indica a condição de obesidade grau 3.");
		
		} sc.close();
	
	}

}
