package br.edu.udc.ex_2_3_5;

import java.util.Scanner;

public class Principal {
	
	private static Scanner teclado;
	
	public static void main(String[] args) {
		int numero;
		
		teclado = new Scanner (System.in);
		
		System.out.println("Entre com um número que tenha pelo menos 5 caracteres:");
		numero = teclado.nextInt();
		
		Processamento leitura = new Processamento(numero);
		
		leitura.divisao(numero);
		
		System.out.println(leitura);

	}

}
