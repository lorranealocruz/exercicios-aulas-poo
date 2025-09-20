package aula08_oficina;

public enum TipoServico {
	TROCA_OLEO(100),
    LAVAR(50),
    REVISAO(200);

    private double valor;

	private TipoServico(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
    
    
    

}
