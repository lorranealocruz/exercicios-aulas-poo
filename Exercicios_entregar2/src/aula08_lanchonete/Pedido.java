package aula08_lanchonete;

import java.time.LocalDate;

public class Pedido {
	
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;
	
	
	public Pedido(Bebida bebida, Sanduiche sanduiche) {
		this.dataPedido = LocalDate.now();
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}


	public LocalDate getDataPedido() {
		return dataPedido;
	}


	public Bebida getBebida() {
		return bebida;
	}


	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	
	public static void imprimirCardapio() {
		System.out.println("---------------CARDÁPIO---------------\n");
		System.out.println("BEBIDAS:");
		for (Bebida b : Bebida.values()) {
            System.out.println("- " + b.getTipo() + " : R$ " + b.getValor());
        }
		System.out.println("\nSANDUICHES:");
        for (Sanduiche s : Sanduiche.values()) {
            System.out.println("- " + s.getTipo() + " : R$ " + s.getValor());
        }
        System.out.println("--------------------------------\n");
    }
	
	public double calcularTotal() {
        return bebida.getValor() + sanduiche.getValor();
    }
		
		
	       
	
	
	

}
