package br.edu.udc_4_2_2;

public class Implementacao {
	
	public static int somaComWhile() {
		int soma = 0, i = 0;
		while(i <= 1000) {
			soma += i;
			i++;
			
			//System.out.printf("%d  = %d + %d\n",soma, soma, i);
		}
		return soma;
	}
	
}
