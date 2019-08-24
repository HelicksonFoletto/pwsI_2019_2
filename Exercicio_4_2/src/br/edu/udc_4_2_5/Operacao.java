package br.edu.udc_4_2_5;

public class Operacao {
	
	public static void multiplosDeTresDoWhile() {
		int contador = 1000;
		
		do {
			if(contador % 3 == 0 ) 
				System.out.println(contador);
			contador ++;
			
		}while(contador <= 1200);
	}
}
