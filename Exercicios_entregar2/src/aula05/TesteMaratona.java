package aula05;

public class TesteMaratona {

	public static void main(String[] args) {

		AtletaAmador a1 = new AtletaAmador("Carlos", "M", 17, 1.70);
		AtletaProfissional a2 = new AtletaProfissional("Fernanda", "F", 20, 1.65);
		AtletaProfissional a3 = new AtletaProfissional("Nicolas", "M", 16, 1.85);
		
		System.out.println(a1);
		a1.verificaSituacao();
		System.out.println("----------------------------------------");
		
		System.out.println(a2);
		a2.verificaSituacao();
		System.out.println("----------------------------------------");
		
		System.out.println(a3);
		a3.verificaSituacao();
		System.out.println("----------------------------------------");

	}

}
