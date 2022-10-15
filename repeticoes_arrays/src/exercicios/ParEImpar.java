package exercicios;
import java.util.Scanner;


public class ParEImpar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int qtdNumeros;
		int numero;
		int pares = 0;
		int impares = 0;
		
		System.out.println("Quantidade de números: ");
		qtdNumeros = scanner.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scanner.nextInt();
			count += 1;
			
			if (numero % 2 == 0) 
				pares+=1;
			else 
				impares+=1;
			
		} while(count < qtdNumeros);
		
		System.out.printf("Quantidade de pares: %d", pares);
		System.out.printf("Quantidade de impares: %d", impares);
	
		
		
	}

}
