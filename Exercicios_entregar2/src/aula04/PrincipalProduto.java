package aula04;

public class PrincipalProduto {

	public static void main(String[] args) {
		
		
		Produto p1 = new Produto ("Arroz", 25.0, 2);
		
		double total = p1.getQuantidade() * p1.getValor();
	
		
	

		System.out.println("Descrição: " + p1.getNome());
		System.out.println("Valor: " + p1.getValor());
		System.out.println("Total: " + total);
		System.out.println("ICMS: " + p1.calcularIcms(total));
		

	}

}
