package edu.udc.psw.aplicacao;

import java.awt.List;

import edu.udc.psw.colecao.*;
import edu.udc.psw.geometria.Ponto2D;

public class Aplicacao {

	public static void main(String[] args) {
		ListaEncadeada<Ponto2D> lista = new ListaEncadeada<Ponto2D>();
		
		
		Ponto2D ponto = new Ponto2D(5,5);
		lista.inserir(ponto, 0);
		
		ponto = new Ponto2D(6,7);
		lista.inserir(ponto, 1);
		
//		System.out.println("Tamanho " + lista.getTamanho());
//		System.out.println("Pos 0 - " + lista.pesquisar(0));
//		System.out.println("Pos 1 - " + lista.pesquisar(1));
		
//		lista.remover(0);
//		
//		System.out.println("Tamanho " + lista.getTamanho());
//		System.out.println("Pos 0 - " + lista.pesquisar(0));
//		
//		lista.remover(0);
//		
//		System.out.println("Tamanho " + lista.getTamanho());
//		
		for(int i = 10; i < 25; i++) {
			ponto = new Ponto2D(i, i+55);
			lista.inserir(ponto, 0);
		}
		
		IteradorAbstrato it = lista.getIteradorInicio();
		do {
			System.out.println(it.dadoAtual());
		} while(it.proximo());
		
		
	}

}
