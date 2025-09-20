package aula06;

import java.util.ArrayList;
import java.util.List;

	//Relacionamentos
public class Principal {

	public static void main(String[] args) {
		
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Teresópolis", estado);
		
		Estado estado2 = new Estado("Paraná", "PR");
		Cidade cidade2 = new Cidade("Guarapuava", estado2);
		
		Endereco e1 = new Endereco("Rua Delfim Moreira, 123", "Centro", cidade);
		Endereco e2 = new Endereco("Rua Delfim Moreira, 122", "Centro", cidade2);
		
		Telefone t1 = new Telefone("(21) 9876-5434");
		
		Telefone t2 = new Telefone("(21) 9876-5466");
		
		Pessoa p1 = new Pessoa("Lorrane Aló", "325477557", e1, null);
		Pessoa p2 = new Pessoa("Marcia Aló", "876422667", e2, null);
		
		List<Telefone> listaTel= new ArrayList<>();
		
		listaTel.add(t1);
		listaTel.add(t2);
		
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Endereço: " + p1.getEndereco().getCidade());
		
		System.out.println("Telefones: ");
		
		for (Telefone tel:  p1.getTelefones()) {
			System.out.println(tel.getTelefone());
		}
		

		}

}
