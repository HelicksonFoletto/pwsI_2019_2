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
		int aux = (int) (numero /2); 
		
		for( i = 2; i < aux; i++) {
			if(numero % i == 0) {
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
