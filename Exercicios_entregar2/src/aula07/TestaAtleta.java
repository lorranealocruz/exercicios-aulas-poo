package aula07;

public class TestaAtleta {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta("Julio", 94, "Boxe", 1);
		
		Atleta a2 = new Atleta("João", 59, "Boxe", 1);
		
		Atleta a3 = new Atleta("Edgar", 86, "Boxe", 2);
		
		Pais p1 = new Pais("Joana", 0, null, 0);
		
		Pais p2 = new Pais("José", 0, null, 0);
		
		a1.getNome();
		a1.verificaSituacao();
		System.out.println("--------------------------------------");
		a2.getNome();
		a2.verificaSituacao();
		System.out.println("--------------------------------------");
		a3.getNome();
		a3.verificaSituacao();
		System.out.println("--------------------------------------");
		

	}

}
