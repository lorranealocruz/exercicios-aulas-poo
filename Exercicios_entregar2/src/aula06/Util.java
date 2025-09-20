package aula06;

//Para qdo tiver um imput de string e depois outro 
//tipo no programa

import java.util.Scanner;

public class Util {
	
	public static String informarString(String msg) {
		Scanner input = new Scanner(System.in);
		
		String texto = input.nextLine();
		
		return texto;
	}
	
	public static char informarChar(char msg) {
		Scanner input = new Scanner(System.in);
		
		char texto = input.next().charAt(0);
		
		return texto;
		
	}

}
