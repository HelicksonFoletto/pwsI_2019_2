package br.edu.udc_7_1_1;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo l1 = new Retangulo();
		Retangulo l2 = new Retangulo(new Ponto2D(1, 1), new Ponto2D(3,5));

		System.out.println(l1);
		System.out.println("O centro de l1 � :" + l1.centro());
		System.out.println(l2);
		System.out.println("O centro de l2 � :" + l2.centro());

		System.out.printf("A distancia entre l1 e l2 � %f\n", 
				l1.distancia(l2));

		Retangulo l3 = new Retangulo();
		Ponto2D p1 = new Ponto2D(-1,5);
		Ponto2D p2 = new Ponto2D(4,7);
		System.out.println(l3);
		l3.setA(p1);
		System.out.println(l3);
		l3.setB(p2);
		System.out.println(l3);

		p1.setX(1);
		Linha l4 = new Linha(p1, p2);
		System.out.println(l4);
		System.out.println(l3);


	}

}
