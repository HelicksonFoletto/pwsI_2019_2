package br.edu.udc.ex_2_3_4;

import java.util.Scanner;

public class Processamento {
	int x;
	private Scanner teclado;
	
	public Processamento() {
		
	}
	public boolean testeNumero(int x) {
		if(x % 2 == 0)
			return true;
		return false;
	}
	public void decisao(int x) {
		if(testeNumero(x))
			System.out.println("N�mero Par!!!");
		else
			System.out.println("N�mero Impar!!!");
	}
	public void entrada() {
		teclado = new Scanner (System.in);
		System.out.println("Entre com o n�mero:");
		x = teclado.nextInt();
		
		decisao(x);
	}
	
}
