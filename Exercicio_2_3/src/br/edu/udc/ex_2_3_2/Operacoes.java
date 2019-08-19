package br.edu.udc.ex_2_3_2;

import java.util.Scanner;

public class Operacoes {
	int a,b;
	int soma;
	int produto;
	int diferenca;
	int quociente;
	private Scanner teclado;
	
	public Operacoes() {
		
	}
	public boolean verificarInteiro(int x, int y) {
		if(x >= 0 && y >= 0)
			return true;
		return false;
	}
	public void resultados(int x, int y) {
		soma = a + b;
		produto = a * b;
		diferenca = a - b;
		if(a > b && b > 0) 
			quociente = a / b;
		if(a < b && a < 0)
			quociente = b / a;
	}
	public void entrada() {
		teclado = new Scanner(System.in);		
		System.out.println("Entre com o valor de x:");
		a = teclado.nextInt();
		System.out.println("Entre com o valor de y:");
		b = teclado.nextInt();
		
		resultados(a,b);
	}
	@Override
	public String toString() {
		return "X: " + a + "\nY:" + b + "\nSoma:" + soma + "\nProduto: " + produto + "\nDiferença: " + diferenca
				+ "\nQuociente: " + quociente + "";
	}
	
}
