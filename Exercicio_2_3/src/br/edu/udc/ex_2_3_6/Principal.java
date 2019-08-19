package br.edu.udc.ex_2_3_6;

import java.util.Scanner;

public class Principal {

	private static Scanner leitura;

	public static void main(String[] args) {
		int numero;
		
		leitura = new Scanner(System.in);
		System.out.println("Entre com um número para ser testado: ");
		numero = leitura.nextInt();
		
		Operacoes op = new Operacoes();
		op.setNumero(numero);
		
		op.entrada();
		
	}

}
