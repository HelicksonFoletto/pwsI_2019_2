package br.edu.udc_4_2_4;

public class Operacao {

	public static void multiplosDeTresWhile() {
		int x = 1000;

		while(x <= 1200) {
			if(x % 3 == 0 ) 
				System.out.println(x);
			x ++;
		}
	}
}
