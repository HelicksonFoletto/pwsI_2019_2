package br.edu.udc.ex_3_3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		int triangulo;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Entre com o primeiro lado do triângulo: ");
		lado1 = leitura.nextInt();
		
		System.out.println("Entre com o segundo lado do triângulo: ");
		lado2 = leitura.nextInt();
		
		System.out.println("Entre com o terceiro lado do triângulo: ");
		lado3 = leitura.nextInt();
		
		triangulo = classificarTriangulo(lado1, lado2, lado3);
		
		if(triangulo == 1)
			System.out.print("Equilátero!");
		if(triangulo == 2)
			System.out.print("Isóceles!");
		if(triangulo == 3)
			System.out.print("Escaleno!");
	}
	public static int classificarTriangulo(int lado1, int lado2, int lado3) {

		if((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) 
			return 1;
			
		if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3))
			return 2;
		
		else
			return 3;
	}

}
