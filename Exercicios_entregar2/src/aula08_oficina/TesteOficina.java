package aula08_oficina;

public class TesteOficina {

	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario("José Carlos do Nascimento");
		
		Carro carro1 = new Carro("Fiesta", "XYZ-1234", p1);
		
		carro1.trocarOleo();
		
		carro1.revisao();
		
		System.out.println("Proprietário: " + p1.getNome());
		System.out.println("Carro: " + carro1.modelo);
		System.out.println("Valor total do serviço R$ " + carro1.getValorCobrado());
		

	}

}
