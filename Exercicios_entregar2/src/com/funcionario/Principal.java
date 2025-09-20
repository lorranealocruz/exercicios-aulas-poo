package com.funcionario;

import funcionario.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
        Funcionario funcionario1 = new Funcionario("Maria", 3000.00);
        
       
        double inss = funcionario1.calcularInss();
        double vale = funcionario1.calcularValeTransporte();

        System.out.println("Funcionário: " + funcionario1.getNome());
        System.out.println("Salário: R$ " + funcionario1.getSalario());
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Desconto Vale Transporte: R$ " + vale);
        System.out.println("Salário líquido: R$ " + funcionario1.calcularSalarioLiquido());

	}
	
	

}
