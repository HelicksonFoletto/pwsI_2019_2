package br.edu.udc.ex_2_6;

import java.util.Scanner;

public class Principal {

	private static Scanner leitura;

	public static void main(String[] args) {
		int numero;
		
		leitura = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero: ");
		numero = leitura.nextInt();
		
		Testes op = new Testes();
		op.setNumero(numero);
		
		int aux = op.somaNumeroImpares();
		
		System.out.printf("A soma dos %d n�meros �mpares �: %d",numero,aux);
	}
}
