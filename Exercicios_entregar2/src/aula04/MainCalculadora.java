package aula04;

import javax.swing.JOptionPane;

public class MainCalculadora {
	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        
        String opStr = JOptionPane.showInputDialog("Qual a operação [+ - * /]?");
        char op = opStr.charAt(0);

        double result;

        switch(op){
            case '-': 
                result = num1 - num2; 
                break;
            case '+': 
                result = num1 + num2; 
                break;
            case '*': 
                result = num1 * num2; 
                break;
            case '/': 
                if(num2 != 0 ){
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero não existe!");
                    return; 
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                return; 
        }

        
        JOptionPane.showMessageDialog(null, "Resultado: " + result);
		
	}
		
}
