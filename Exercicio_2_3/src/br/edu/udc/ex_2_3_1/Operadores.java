package br.edu.udc.ex_2_3_1;

import java.util.Scanner;

public class Operadores {
	int x,y,z,prod;
	private Scanner teclado;
	
	public Operadores() {
	
	}
	public void produto(int a, int b, int c) {
		prod = a * b * c;
	}
	void entrada() {
		teclado = new Scanner(System.in);
		System.out.println("Entre com o valor de x: ");
		x = teclado.nextInt();
		System.out.println("Entre com o valor de y: ");
		y = teclado.nextInt();
		System.out.println("Entre com o valor de z: ");
		z = teclado.nextInt();
		
		produto(x,y,z);
	}
	@Override
	public String toString() {
		return "X: " + x + "\nY: " + y + "\nZ: " + z + "\nProduto: " + prod + "";
	}
}
