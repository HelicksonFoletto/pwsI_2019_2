package br.edu.udc_4_2_6;

import java.util.Scanner;

public class Operacao {
	
	private Scanner leitura;
	public  void fatorial(int valor) {
		long fat = 1;
		
		for(int i = 2; i <= valor; i++) {
			fat *= i;
			System.out.println(fat);
		}
		
	}
	public void entrada() {
		int valor;
		
		leitura = new Scanner(System.in);
		System.out.println("Entre com o valor que deseja calcular o fatorial: ");
		valor = leitura.nextInt();
		
		fatorial(valor);
	}
	
}
