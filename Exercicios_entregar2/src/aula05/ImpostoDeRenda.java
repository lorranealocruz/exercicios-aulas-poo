package aula05;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimento;
	
	public ImpostoDeRenda(String nome, double rendimento) {
		this.nome = nome;
		this.rendimento = rendimento;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public double calculoIR(double rendimento) {
		return rendimento * 0.12;
	}

}
