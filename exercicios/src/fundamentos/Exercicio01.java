package fundamentos;

import java.util.Scanner;

public class Exercicio01 {
	//1)Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	//
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		
		System.out.println("Valor em Farenheit: " + conversao);
		
		scanner.close();
	}
	

}
