package aula04;

public class Medico {
	private String crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	
	public Medico(String crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}


	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	
	public void pagamentoDinheiro(double valorConsulta) {
		this.salario += valorConsulta;
	}
	
	
	public void pagamentoPlano(double valorConsulta) {
		this.salario += (valorConsulta * 0.7);
	}
	
	public void imprimir() {
		System.out.println("DADOS DO MÉDICO");
		System.out.println("---------------------------");
		System.out.printf("CRM: %s - %s\n", crm, nome);
		System.out.printf("Salario: %.2f", salario);
	}
	
	

}
