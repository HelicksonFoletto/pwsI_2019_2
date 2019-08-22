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
		String aux = "diretor";
		String aux2 = "gerente";
		
		if(cargo == aux) {
			System.out.print("teste if 1");
			if(salario >= 6000) {
				aumento = (float) (salario * 0.015);
				calculaNovoSalario(salario, aumento, cargo);
			}			
			if(salario < 6000) {
				aumento = (float) (salario * 0.025);
				calculaNovoSalario(salario, aumento, cargo);
			}
		}
		if(cargo == aux2){
			System.out.print("teste if 3");
			if(salario >= 5000) {
				aumento = (float) (salario * 0.02);
				calculaNovoSalario(salario, aumento, cargo);
			}
			if(salario < 5000) {
				aumento = (float) (salario * 0.025);
				calculaNovoSalario(salario, aumento, cargo);
			}	
		}
		if((cargo != "gerente") && (cargo != "diretor")) {
			System.out.print("teste if 5\n");
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
		System.out.printf("%s",cargo);
	}
}
