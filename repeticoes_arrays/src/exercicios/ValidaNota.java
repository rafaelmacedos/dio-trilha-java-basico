package exercicios;
import java.util.Scanner;

public class ValidaNota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scanner.nextInt();
		
		while (nota < 0 | nota > 10){
			System.out.println("Nota Inválida! Digite Novamente: ");
			nota = scanner.nextInt();
		}
		
		
	}

}
