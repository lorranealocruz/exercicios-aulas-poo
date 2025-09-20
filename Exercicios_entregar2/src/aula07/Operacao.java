package aula07;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	
	
	public Operacao(String tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}
	
	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02;
		valorOperacao += livro.getValor() * taxaEmprestimo/100;
	}
	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;
		
	}
	
	

	

}
