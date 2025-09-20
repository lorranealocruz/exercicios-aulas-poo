package aula02;

public class Times {

	public static void main(String[] args) {
		String time = "";
		String estado = "SP";
		
		switch (estado) {
		case "RJ": 
			time = "Flamengo, Vasco, Botafogo, Fluminense";
			break;
		case "SP":
			time = "Corintias, Palmeiras, Santos, São Paulo";
			break;
		default: 
			System.out.println("Estado inválido.");
		}
		
		System.out.println("Os times do estado " + estado + " são: " + time);

	}

}
