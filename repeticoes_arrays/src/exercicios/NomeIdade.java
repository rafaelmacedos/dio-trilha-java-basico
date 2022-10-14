package exercicios;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
    		System.out.printf("Seu nome é %s e você tem %d anos",nome , idade);
    		System.out.println("");
        }
        

		
				
		
	}

}


