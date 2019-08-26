package br.edu.udc_4_3;

import java.util.Scanner;

public class Principal {

	private static Scanner leitura;

	public static void main(String[] args) {

		calculoMatematico(entrada());
		
	}
	
	public static int entrada() {
		int x;
		
		leitura = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X:");
		x = leitura.nextInt();
		
		return x;
	}
	
	public static void calculoMatematico(int x) {
		System.out.println(x);
		while(x != 1) {
			if(x % 2 ==0) {
				x = x / 2;
			}else {
				x = ((2 * x) / 3) + 1;
			}
			System.out.println(x);
						
		}
	}
}
