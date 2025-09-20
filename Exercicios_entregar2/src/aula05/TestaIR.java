package aula05;

public class TestaIR {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("José de Assis", 25000.0,"14376655434", "1234567");
		PessoaJuridica pj = new PessoaJuridica("Empresa X", 1500000.0, "12378", "6543224");
		
		System.out.println("Pessoa Física: " + pf.getNome());
		System.out.println("Rendimento: " + pf.getRendimento());
		System.out.println("IR Pessoa Fìsica: " + pf.calculoIR(pf.rendimento));
        System.out.println("------------------------------");
        System.out.println("Pessoa Jurídica: " + pj.getNome());
        System.out.println("Rendimento: " + pj.getRendimento());
        System.out.println("IR Pessoa Jurídica: " + pj.calculoIR(pj.getRendimento()));
	}

}
