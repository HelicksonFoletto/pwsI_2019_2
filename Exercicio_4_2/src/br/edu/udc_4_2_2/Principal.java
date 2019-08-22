package br.edu.udc_4_2_2;

public class Principal {

	public static void main(String[] args) {
		int i;
		
		Implementacao op = new Implementacao();
		i = Implementacao.somaComWhile();
		
		System.out.printf("A soma de todos os números inteiros de 1 á 1000 é: %d",i);
		
	}

}
