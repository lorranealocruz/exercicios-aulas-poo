package aula03;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		
		int antecessor = numero - 1;
        int sucessor = numero + 1;
        
        String mensagem = "Número digitado: " + numero + "\nAntecessor: " + antecessor + "\nSucessor: " + sucessor;

        
        JOptionPane.showMessageDialog(null, mensagem);

	}

}
