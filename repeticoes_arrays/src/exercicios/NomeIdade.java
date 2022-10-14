package exercicios;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.printf("Seu nome é %s e você tem %d anos",nome , idade);
		
				
		
	}

}
