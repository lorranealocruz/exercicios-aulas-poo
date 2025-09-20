package aula03;

public class Conta {
	
	String titular;
	int numero;
	double saldo;
	
	public void exibirConta() {
		System.out.println("Titular: " + titular);
		System.out.println("Número: " + numero);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("-----------------------------");
	}

}
