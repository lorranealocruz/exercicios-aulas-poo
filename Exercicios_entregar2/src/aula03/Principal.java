package aula03;

public class Principal {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
        conta1.titular = "Lorrane";
        conta1.numero = 123;
        conta1.saldo = 15000.00;
        
        Conta conta2 = new Conta();
        conta2.titular = "Eduardo";
        conta2.numero = 456;
        conta2.saldo = 25000.00;
        
        conta1.exibirConta();
        conta2.exibirConta();
	
	}

}
