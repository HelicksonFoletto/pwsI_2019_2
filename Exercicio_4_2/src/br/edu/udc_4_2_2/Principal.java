package br.edu.udc_4_2_2;

public class Principal {

	public static void main(String[] args) {
		int i;
		
		Implementacao op = new Implementacao();
		i = Implementacao.somaComWhile();
		
		System.out.printf("A soma de todos os n�meros inteiros de 1 � 1000 �: %d",i);
		
	}

}
