package aula02;

public class CalculoInss {
	public static void main(String[] args ) {
		String nome = "José Carlos do Nascimento Cruz";
		double salario = 5819.00;
		
		String msg = """
				Cálculo do INSS
				---------------
				""";
		
		System.out.println(msg);
		
		if (salario <= 1518.00) {
			System.out.println("Olá, Sr " + nome + "\nO seu salário é: " + salario + "\nVocê não tem desconto do INSS.");
		} else if (salario > 1518.00 && salario <= 2793.88) {
			salario = ((salario - (salario/100) * 9));
			System.out.println("Olá, Sr " + nome + "\nO seu salário com o desconto INSS é R$ " + salario);
		} else if (salario > 2793.88 && salario <= 4190.83) {
			salario = ((salario - (salario/100) * 12));
			System.out.println("Olá, Sr " + nome + "\nO seu salário com o desconto INSS é R$ " + salario);
		} else if (salario > 4190.83 && salario <= 8157.41) {
			salario = ((salario - (salario/100) * 14));
			System.out.println("Olá, Sr " + nome + "\nO seu salário com o desconto INSS é R$ " + salario);
		}

	}

}
