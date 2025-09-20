package aula04;

public class TestaMedico {

	public static void main(String[] args) {

		Medico m1 = new Medico("12345", "Ana Maria", 0.0, 250.0);
		Medico m2 = new Medico("456789", "Antônio", 0.0, 300.0);
		
		m1.pagamentoDinheiro(0);
		m2.pagamentoPlano(0);
		
		m1.imprimir();
		m2.imprimir();


	}

}
