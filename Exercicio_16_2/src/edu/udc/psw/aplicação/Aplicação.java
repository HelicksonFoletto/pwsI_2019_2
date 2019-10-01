package edu.udc.psw.aplicação;

import br.edu.udc_7_1_1.Ponto2D;
import edu.udc.psw.Iterador;
import edu.udc.psw.ListaEncadeada;

public class Aplicação {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

			lista.inserirInicio(new Ponto2D(0, 2));
			lista.inserirInicio(new Ponto2D(2, 4));
			lista.InserirMeio(new Ponto2D(1, 8), 2);
			lista.inserirFim(new Ponto2D(1, 1));
			lista.inserirFim(new Ponto2D(9, 1));
		
			iterarLista(lista);
			
			System.out.println("Pesquisa" + lista.pesquisar(4));
			lista.remover(4);

			System.out.println("Tamanho Lista: " + lista.getTamanho());
			for (int i = 1; i <= lista.getTamanho(); i++) {
				System.out.println(i + " - " + lista.pesquisar(i));
			}
		}
	public static void iterarLista(ListaEncadeada lista) {
		Iterador it = lista.getInicio();
		Object obj;
		for(int i = 1; 
				(obj = it.proximo()) != null; 
				System.out.println(i++ + " -> " +obj));
	}
}
