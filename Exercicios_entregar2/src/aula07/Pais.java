package aula07;

public class Pais extends Atleta{
	private String nome;
	
	public Pais(String nome, double peso, String modalidade, int totalParticipantes) {
		super(nome, peso, modalidade, totalParticipantes);
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
