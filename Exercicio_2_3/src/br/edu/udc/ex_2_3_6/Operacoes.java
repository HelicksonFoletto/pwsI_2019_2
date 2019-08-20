package br.edu.udc.ex_2_3_6;

public class Operacoes {
	private int numero;
	
	public Operacoes() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean verificaNumero() {
		int i;
		
		for( i = 2; i < numero; i++) {
			if(numero % 2 == 1) {
				return true;
			}
		}
		return false;
	}
	public void entrada() {
		
		verificaNumero();
		
		if(numero == 1 || numero == 2) {
			System.out.print("Número é primo!");
		}
		if(verificaNumero()) {
			System.out.print("Número é primo!");
		}else
			System.out.print("Número não é primo!");
	}
}
