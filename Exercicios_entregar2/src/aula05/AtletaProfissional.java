package aula05;

public class AtletaProfissional extends Maratona{
	
	private double peso;
	
	public AtletaProfissional(String nome, String sexo, int idade, double altura) {
		super(nome, sexo, idade, altura);
		
	}

	  @Override
	    public String toString() {
	        return "Atleta Profissional -> " + super.toString();
	    }


}
