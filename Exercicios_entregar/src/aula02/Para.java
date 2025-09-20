package aula02;

public class Para {

	public static void main(String[] args) {
		multiplosde2();
		parOuImpar();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("for: " + i);
		}
	
	}
	
	public static void parOuImpar() {
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				par++;
				
			} else {
				impar++;
			}
		}
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);



	}
	
	public static void multiplosde2() {
		int total = 0;
		
		for (int i = 1; i <= 22; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - Java");
				total++;
			}
		}
		System.out.println("O total de múltiplos de 2 é " + total);
	}

}
