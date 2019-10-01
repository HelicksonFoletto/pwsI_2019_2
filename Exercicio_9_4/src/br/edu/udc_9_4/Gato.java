package br.edu.udc_9_4;

public class Gato extends Animal{
	private String cor;
	private int idade;
	
	public Gato(boolean extinto, boolean vertebrado, String cor, int idade) {
		super(extinto, vertebrado);
		this.cor = cor;
		this.idade = idade;
	}
	
	
}
