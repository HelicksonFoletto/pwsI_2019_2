package br.edu.udc_16_1;

import br.edu.udc_7_1_1.Ponto2D;
import br.edu.udc_colecao.ListaEncadeada;

public class Aplicacao {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

		lista.inserirInicio(new Ponto2D(5, 2));
		lista.inserirInicio(new Ponto2D(6, 9));
		lista.InserirMeio(new Ponto2D(2, 5), 2);
		lista.inserirFim(new Ponto2D(6, 9));
		lista.inserirFim(new Ponto2D(0, 10));
		
		
		
		System.out.println("Pesquisa" + lista.pesquisar(3));
		lista.remover(3);
		


		System.out.println("Tamanho Lista: " + lista.getTamanho());
		for (int i = 1; i <= lista.getTamanho(); i++) {
			System.out.println(i + " - " + lista.pesquisar(i));
		}
	}
}


