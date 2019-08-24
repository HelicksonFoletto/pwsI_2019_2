package br.edu.udc_4_2_7;

public class Operacao {

	public static void fibonacci() {
		long fib = 0;
		long ant = 0;
		
		for(int i = 0; i <= 100 ; i++) {
			if(i == 1) {
				fib = 1;
				ant = 0;
			}
			else{
				fib += ant;
				ant = fib - ant;
			}
			System.out.println(fib);
		}
	}
}
