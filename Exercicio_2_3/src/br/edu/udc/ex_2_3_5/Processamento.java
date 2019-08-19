package br.edu.udc.ex_2_3_5;

public class Processamento {
	int numero;
	int primeiro, segundo, terceiro, quarto, quinto;
	
	public Processamento(int x) {
		if(!verificaTamanho(x))
			return;
		this.numero = x;
	}
	public boolean verificaTamanho(int x) {
		if((x >= 11111) && (x <= 99999))
			return true;
		return false;
	}
	public void divisao(int numero) {
		if(!verificaTamanho(numero)) {
			System.out.println("Erro!");
			return;
		}				
		quinto = numero % 10;
		numero /= 10;
		quarto = numero % 10;
		numero /= 10;
		terceiro = numero % 10;
		numero /= 10;
		segundo = numero % 10;
		numero /= 10;
		primeiro = numero % 10;
	}
	@Override
	public String toString() {
		return "Número: " + numero + "\n" + primeiro + " " + segundo + " " 
				+ terceiro + " " + quarto + " " + quinto + "";
	}
	

}
