package br.edu.udc.ex_2_6;

public class Testes {
	private int numero;
		
	public Testes() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int somaNumeroImpares() {
		int soma = 0;
		for (int i = 0; i <= numero * 2; i++) {
			if( i % 2 == 1) {
				soma += i;
				System.out.println(i);
			}	
		}
		return soma;
	}
}
