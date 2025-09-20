package aula05;

public class Freelancer extends Vendedor{
	
	private int diasTrabalhados;
	private double valorDia;
	
	
	public Freelancer(String nome, String cpf, int diasTrabalhados, double valorDia) {
		super(nome,cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	
	}


	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}


	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}


	public double getValorDia() {
		return valorDia;
	}


	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}
	
	
	public double calcularSalario() {
		return diasTrabalhados * valorDia;
	}

		
	
	

	

}
