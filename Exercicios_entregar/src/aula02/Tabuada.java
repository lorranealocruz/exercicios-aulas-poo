package aula02;

public class Tabuada {

	public static void main(String[] args) {
		tabuadaDoWhile();
		int valor = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));

		}

	}
	
	public static void tabuadaDoWhile() {
		int numero = 2;
		int i = 1;	
		
		do { 
			System.out.println(numero + " x " + i + " = " + (numero * i));
			i++;
			
		} while (i <= 10);

	}
}