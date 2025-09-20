package aula03;

import javax.swing.JOptionPane;

public class JoptionPane2 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String email = JOptionPane.showInputDialog("Digite seu e-mail:");
        
        double salario = Double.parseDouble(
                JOptionPane.showInputDialog("Digite seu salário:"));
        
        double salarioComAumento = salario * 1.10;
        
        String mensagem = String.format(
                "Nome: %s\nTelefone: %s\nE-mail: %s\nSalário com 10%% de aumento: R$ %.2f",
                nome, telefone, email, salarioComAumento);
        
        JOptionPane.showMessageDialog(null, mensagem);

	}

}
