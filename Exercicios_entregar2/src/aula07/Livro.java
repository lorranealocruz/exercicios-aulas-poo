package aula07;

public class Livro {
	
	private String autor;
	private String titulo;
	private double valor;
	
	
	public Livro(String titulo, double valor) {
		super();
		this.titulo = titulo;
		this.valor = valor;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getValor() {
		return valor;
	}


	public void reajuste(double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", valor=" + valor + "]";
	}
	

}
