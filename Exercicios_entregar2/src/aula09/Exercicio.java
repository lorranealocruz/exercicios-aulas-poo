package aula09;

public class Exercicio {
	public static void main(String[] args) {
		int vetor1[] = {1, 2, 3, 4, 5};
		int vetor2[] = {3, 0, 2};
		int resultado = 0;
		
		for(int i = 0; i < vetor1.length; i++) {
			try {
			resultado = vetor1[i] / vetor2[i];
			
			} catch (ArithmeticException e) {
				System.out.println("Laço " + i + ": Divisão por zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: índice " + i + " fora do tamanho de um dos vetores");
			}
		
		}
	System.out.println("Programa finalizado sem ser interompido");
		}

	}

