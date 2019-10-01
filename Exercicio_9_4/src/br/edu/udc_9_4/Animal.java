package br.edu.udc_9_4;

public abstract class Animal extends SerVivo {
	private boolean vertebrado;

	
	public Animal(boolean vertebrado) {
		super();
		this.vertebrado = true;
	}
	
	@Override
	public String toString() {
		return "\nVertebrado: " + vertebrado + super.toString();
	}	
}
