package br.edu.udc.ex_2_3_3;

import java.util.Scanner;

public class Operacoes {
	int soma;
	int media;
	int produto;
	int maiorNumero, menorNumero;
	int a,b,c;
	private Scanner teclado;
	
	public Operacoes () {
		
	}
	
	public void calculos(int a, int b, int c) {
		soma = a + b + c;
		media = (a + b + c) / 3;
		produto = a * b * c;
		
		if((a > b) && (a > c)) {
			maiorNumero = a;
			if(b > c) 
				menorNumero = c;
			if(c > b)
				menorNumero = b;
			if(c == b || b == c)
				menorNumero = b;
		}
		if((b > c) && (b > a)) {
			maiorNumero = b;
			if(c > a)
				menorNumero = a;
			if(a > c)
				menorNumero = c;
			if(a == c || c == a)
				menorNumero = a;
		}
		if((c > b) && (c > a)) {
			maiorNumero = c;
			if(b > a)
				menorNumero = a;
			if(a > b)
				menorNumero = b;
			if(b == a || a == b)
				menorNumero = a;
		}				
	}
	public void entrada() {
		teclado = new Scanner(System.in);
		System.out.println("Entre com o valor de x:");
		a = teclado.nextInt();
		System.out.println("Entre com o valor de y:");
		b = teclado.nextInt();
		System.out.println("Entre com o valor de z:");
		c = teclado.nextInt();
		
		calculos(a,b,c);
	}
	@Override
	public String toString() {
		return "Soma: " + soma + "\nMédia: " + media + "\nProduto: " + produto + "\nMaior Número: " + maiorNumero
				+ "\nMenor Número: " + menorNumero + "\nA: " + a + "\nB: " + b + "\nC: " + c + "";
	}	
}
