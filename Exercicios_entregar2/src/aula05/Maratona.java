package aula05;

public class Maratona {
	private String nome;
	private String sexo;
	private int idade;
	private double altura;
	
	
	public Maratona(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void verificaSituacao() {
        if (idade > 18 || altura >= 1.80) {
            System.out.println(nome + " participará da competição!");
        } else {
            System.out.println(nome + " não participará da competição!");
        }
    }


	@Override
	public String toString() {
		return "Maratona [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
	

	
	
	
	

}
