package br.edu.udc.ex_2_3_5;

import java.util.Scanner;

public class Processamento {
	int numero;
	int primeiro, segundo, terceiro, quarto, quinto;
	private Scanner teclado;
	
	public Processamento() {

	}
	public boolean verificaTamanho(int x) {
		if((x >= 11111) && (x <= 99999))
			return true;
		return false;
	}
	public void divisao(int numero) {
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
	}
	public void entrada() {
		
		teclado = new Scanner (System.in);
		
		System.out.println("Entre com um número que tenha pelo menos 5 caracteres:");
		numero = teclado.nextInt();
		
		if(verificaTamanho(numero)) {
			divisao(numero);
		}		
	}
	@Override
	public String toString() {
		return "Número: " + numero + "\n" + primeiro + " " + segundo + " " 
				+ terceiro + " " + quarto + " " + quinto + "";
	}
	

}
