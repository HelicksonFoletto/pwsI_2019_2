package br.edu.udc.ex_2_2;

public class Processamento {
	int soma, diferenca;
	int x,y;

	public Processamento(int a, int b) {
		if(!verificarInteiro(a,b)) {
			System.out.println("Número não é inteiro!");
			return;
		}
		this.x = a;
		this.y = b;
	}
	public boolean verificarInteiro(int a, int b) {
		if(a >= 0 && b >= 0)
			return true;
		return false;
	}
	public void operacao(int a, int b) {
		soma = a + b;
		if(soma < 0)
			soma = 0;
		
		diferenca = a - b;
		if(diferenca < 0)
			diferenca = 0;
	}
	@Override
	public String toString() {
		return "Soma: " + soma + "\nDiferença: " + diferenca + "";
	}
		
}
