package br.edu.udc.ex_2_2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Entre com dois números: ");
		
		Scanner teclado = new Scanner(System.in);
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		
		Processamento op = new Processamento(numero1, numero2);
		op.operacao(numero1, numero2);
		
		System.out.print(op);
	}
}
