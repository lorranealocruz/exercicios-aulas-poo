package aula02;

public class SituacaoAluno {
	public static void main(String[] args ) {
		double nota1 = 8.0;
		double nota2 = 9.0;
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10.0) {
			System.out.println("A média foi: " + media + "\nAprovado. Parabéns!");
		} else if (media < 7.0) {
			System.out.println("A média foi: " + media + "\nReprovado");
		} else {
			System.out.println("A média foi: " + media + "\nAprovado");
		}
			
	}
	

}
