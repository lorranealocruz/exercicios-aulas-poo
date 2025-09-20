package aula08_lanchonete;

public class TestePedido {

	public static void main(String[] args) {
		
		Pedido.imprimirCardapio();
		
		Pedido pedido1 = new Pedido(Bebida.SUCO, Sanduiche.X_BACON);
		
		System.out.println("PEDIDO REALIZADO EM: " + pedido1.getDataPedido());
        System.out.println("Bebida: " + pedido1.getBebida().getTipo());
        System.out.println("Sanduíche: " + pedido1.getSanduiche().getTipo());
        System.out.println("Total: R$ " + pedido1.calcularTotal());
   
	}

}
