package aula08_oficina;

public abstract class Veiculo implements Oficina {
	protected String modelo;
    protected String placa;
    protected Proprietario proprietario;
    protected double valorCobrado;
    
    
	public Veiculo(String modelo, String placa, Proprietario proprietario) {
		this.modelo = modelo;
		this.placa = placa;
		this.proprietario = proprietario;
		this.valorCobrado = valorCobrado = 0.0;
	}


	public String getModelo() {
		return modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public Proprietario getProprietario() {
		return proprietario;
	}


	public double getValorCobrado() {
		return valorCobrado;
	}


	@Override
	public String toString() {
		return "Modelo: " + modelo + ", Placa: " + placa + "]";
	}
    
	
    

}
