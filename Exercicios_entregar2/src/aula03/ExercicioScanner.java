package aula03;

import java.util.Scanner;

public class ExercicioScanner {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = teclado.nextLine();
		
		System.out.print("Digite um número inteiro: ");
		int num = teclado.nextInt();
		
		System.out.print("Digite um número real: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Texto: " + texto);
		System.out.println("Inteiro: " + num);
		System.out.println("Real: " + num2);
		
		teclado.close();

	}

}
