package aula08;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		FuncionarioPublico f1 = new FuncionarioPublico("Maria Silva", 3500.00, 2015);
		FuncionarioPublico f2 = new FuncionarioPublico("João Souza", 4200.00, 2018);
		FuncionarioPublico f3 = new FuncionarioPublico("Ana Costa", 5000.00, 2020);
		
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();

	}

}
