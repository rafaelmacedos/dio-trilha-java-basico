package exercicios;
import java.util.Scanner;

public class MaiorEMedia {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	int maior = 0;
	
	int soma = 0;
	
	int count = 0;
	
	do {
		System.out.println("Número: ");
		numero = scanner.nextInt();
		count = count + 1;
		
		soma = soma + numero;
		
		if (numero > maior) maior = numero;
		
	} while(count < 5);
	
	
	System.out.println("O maior número é: " + maior);
	System.out.println("Média: " + (soma/5));
	}

}
