package br.edu.udc_ex_3_5;

import java.util.Scanner;

public class Principal {

	private static Scanner leitura;
	public static void main(String[] args) {
		String cargo;
		float salario;
		
		leitura = new Scanner(System.in);
		
		System.out.println("Digite seu cargo: ");
		cargo = leitura.nextLine();
		
		System.out.println("Digite seu salário: ");
		salario = leitura.nextFloat();
			
		somaAumento(cargo, salario);
		
	}
	public static void somaAumento(String cargo, float salario) {
		float aumento = 0;
		
		if(cargo.equals ("diretor")) {
			if(salario >= 6000) {
				aumento = (float) (salario * 0.015);
				calculaNovoSalario(salario, aumento, cargo);
			}			
			if(salario < 6000) {
				aumento = (float) (salario * 0.025);
				calculaNovoSalario(salario, aumento, cargo);
			}
		}
		if(cargo.contains("gerente")){
			if(salario >= 5000) {
				aumento = (float) (salario * 0.02);
				calculaNovoSalario(salario, aumento, cargo);
			}
			if(salario < 5000) {
				aumento = (float) (salario * 0.025);
				calculaNovoSalario(salario, aumento, cargo);
			}	
		}
		if((!cargo.contains("gerente")) && (!cargo.contains("diretor"))) {
			if((salario >= 2500)) {
				aumento = (float) (salario * 0.03);
				calculaNovoSalario(salario, aumento, cargo);
			}
			if((salario < 2500)) {
				aumento = (float) (salario * 0.04);
				calculaNovoSalario(salario, aumento, cargo);
			}
		}
	}
	public static void calculaNovoSalario(float salario, float aux, String cargo) {
		System.out.printf("Seu salário atual é %.2f\nSeu aumento é de %.2f\nTotal do novo salário %.2f\n",
				salario,aux, salario+aux);
	}
}
