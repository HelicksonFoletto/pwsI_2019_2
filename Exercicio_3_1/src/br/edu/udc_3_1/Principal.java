package br.edu.udc_3_1;

import java.util.Scanner;

public class Principal {

	private static Scanner leitura;
	public static void main(String[] args) {
		int numero;
		
		leitura = new Scanner(System.in);
		System.out.println("Entre com um número de 5 digitos:");
		numero = leitura.nextInt();
		
		divisao(numero);
		
	}
	public static boolean verificaTamanho(int numero) {
		if((numero > 9999) && (numero <= 99999))
			return true;
		return false;
	}
	public static void divisao(int numero) {		
		int primeiro, segundo, terceiro, quarto, quinto;
		
		if(!verificaTamanho(numero)) {
			System.out.println("Erro!");
			return;
		}				
		quinto = numero % 10;
		numero /= 10;
		
		quarto = numero % 10;
		numero /= 10;
		
		terceiro = numero % 10;
		numero /= 10;
		
		segundo = numero % 10;
		numero /= 10;
		
		primeiro = numero % 10;
		imprimeDigitos(primeiro);
		imprimeDigitos(segundo);
		imprimeDigitos(terceiro);
		imprimeDigitos(quarto);
		imprimeDigitos(quinto);

	}
	public static void imprimeDigitos(int a) {
		if((a == 0))
			System.out.print("zero, ");
		if((a == 1))
			System.out.print("um, ");
		if((a == 2))
			System.out.print("dois, ");
		if((a == 3))
			System.out.print("três, ");
		if((a == 4))
			System.out.print("quarto, ");
		if((a == 5))
			System.out.print("cinco, ");
		if((a == 6))
			System.out.print("seis, ");
		if((a == 7))
			System.out.print("sete, ");
		if((a == 8))
			System.out.print("oito, ");
		if((a == 9))
			System.out.print("nove, ");
	}
}
