package aula03;

import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		
		String[] nomes = new String[4];
        double[] pesos = new double[4];
        double[] alturas = new double[4];
        
        for (int i = 0; i < 4; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso de " + nomes[i] + " (kg):"));
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nomes[i] + " (m):"));
        }
        
        double maiorPeso = pesos[0];
        String nomeMaiorPeso = nomes[0];
        
        double maiorAltura = alturas[0];
        String nomeMaiorAltura = nomes[0];
        
        double somaPesos = 0;
        double somaAlturas = 0;
        
        for (int i = 0; i < 4; i++) {
            somaPesos += pesos[i];
            somaAlturas += alturas[i];
            
            if (pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
                nomeMaiorPeso = nomes[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
                nomeMaiorAltura = nomes[i];
            }
        }
        
        double mediaPeso = somaPesos / 4;
        double mediaAltura = somaAlturas / 4;
        
        String resultado = String.format(
                "Pessoa com maior peso: %s (%.2f kg)\n" +
                "Pessoa com maior altura: %s (%.2f m)\n" +
                "Média de peso: %.2f kg\n" +
                "Média de altura: %.2f m",
                nomeMaiorPeso, maiorPeso,
                nomeMaiorAltura, maiorAltura,
                mediaPeso,
                mediaAltura);
        
        JOptionPane.showMessageDialog(null, resultado);

	}
	
	
	
	

}
