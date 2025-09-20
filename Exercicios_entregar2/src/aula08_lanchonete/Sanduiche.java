package aula08_lanchonete;

public enum Sanduiche {
	 
	 X_SALADA("X-Salada", 12.0),
	 X_BACON("X-Bacon", 15.0),
	 X_FRANGO("X-Frango", 14.0);
	
	 private String tipo;
	 private double valor;
	 
	private Sanduiche(String tipo, double valor) {
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
