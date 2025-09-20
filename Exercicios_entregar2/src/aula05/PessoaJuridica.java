package aula05;

public class PessoaJuridica extends ImpostoDeRenda{
	
	private String cnpj;
	private String inscEstadual;
	

	public PessoaJuridica(String nome, double rendimento, String cnpj, String inscEstadual) {
		super(nome, rendimento);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	
	public double calculoIR(double rendimento) {
		return rendimento * 0.15;
	}

}
