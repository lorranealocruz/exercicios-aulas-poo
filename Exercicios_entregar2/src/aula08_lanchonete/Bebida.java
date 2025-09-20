package aula08_lanchonete;

public enum Bebida {
	COCA_COLA("Coca-Cola", 6.0),
	SUCO("Suco natural", 8.0),
	AGUA("Água mineral", 3.0);
	
	private String tipo;
	private double valor;
	
	private Bebida(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}
	
	
	

}
