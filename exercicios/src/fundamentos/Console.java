package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.printf("Veja: %d %d", 1 ,2);
		System.out.printf("\nNome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();		
		
		System.out.printf("%s %s tem %d anos.",nome, sobrenome, idade);
		
		entrada.close();
		
		
	}

}
