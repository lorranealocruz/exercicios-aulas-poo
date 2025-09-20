package aula05;

public class AtletaAmador extends Maratona{
	
	public boolean atestado;
	
	public AtletaAmador(String nome, String sexo, int idade, double altura) {
		super(nome, sexo, idade, altura);
		
	}


	 @Override
	    public String toString() {
	        return "Atleta Amador -> " + super.toString();
	    }

	

}
