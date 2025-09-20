package aula09;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		
		try {
		System.out.println("O número digitado foi " + sc.nextInt());
			
		} catch ( java.util.InputMismatchException e) {
			System.out.println("Falha ao ler o número");
		}
		

	}

}
