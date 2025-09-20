package aula08;

public class FuncionarioPublico {
	private String nome;
	private double salario;
	private final int anoConcurso;
	
	
	public FuncionarioPublico(String nome, double salario, int anoConcurso) {
		this.nome = nome;
		this.salario = salario;
		this.anoConcurso = anoConcurso;
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
	
	public void mostrarDados() {
		System.out.println("Nome " + nome);
		System.out.println("Salário: R$ " + salario);
        System.out.println("Ano do Concurso: " + anoConcurso);
        System.out.println("-------------------------");
	}
	

}
