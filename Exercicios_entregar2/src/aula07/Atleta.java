package aula07;

public class Atleta {
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	
	public Atleta(String nome, double peso, String modalidade, int totalParticipantes) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.totalParticipantes = totalParticipantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setTotalParticipantes(int totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", peso=" + peso + ", modalidade=" + modalidade + ", totalParticipantes="
				+ totalParticipantes + "]";
	}
	
	public String verificaSituacao() {
        if (peso > 90) {
            System.out.println(nome + " é peso pesado → participará");
            return "participará";
        } else if (peso >= 60 && peso <= 90) {
            System.out.println(nome + " é peso médio → participará");
            return "participará";
        } else {
            System.out.println(nome + " não participará");
            return "não participará";
        }
    }

	
	

}
