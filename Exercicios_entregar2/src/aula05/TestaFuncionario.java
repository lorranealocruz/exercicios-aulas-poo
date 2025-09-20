package aula05;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Freelancer f1 = new Freelancer("Amanda", "987.654.321-00", 20, 150.0);
		
		Fixo fx1 = new Fixo ("Jonas", "987.654.321-99", 2400.0, 0.03);
		
		double salario = f1.calcularSalario();
		
		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Dias trabalhados: " + f1.getDiasTrabalhados());
		System.out.println("Valor do dia: " + f1.getValorDia());
		System.out.println("Salário total: R$ " + salario);
		
		System.out.println("------------------------");
		System.out.println("Nome: " + fx1.getNome());
		System.out.println("CPF: " + fx1.getCpf());
		System.out.println("Salário base: R$ " + fx1.getSalarioBase());
		System.out.println("Comissão: " + fx1.getComissao());
		System.out.println(fx1.calcularSalario(salario));
		

	}

}
