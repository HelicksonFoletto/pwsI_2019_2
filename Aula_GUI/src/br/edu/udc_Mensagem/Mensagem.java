package br.edu.udc_Mensagem;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Ol� Mundo!");// primeiro � a caixa pai.... logo ap�s vem a mensagem
//		Janela de di�logo		
		
//		JOptionPane.showInputDialog("Qual � seu nome?"); // Janela de pergunta
		
		String nome = JOptionPane.showInputDialog(null,"Qual � seu nome?");
		String idade = JOptionPane.showInputDialog(null,"Qual � sua idade " + nome + "?");
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " de " + idade + " anos.");		
		int i = Integer.parseInt(idade); // parseInt verifica se o conte�do da vari�vel � um n�mero inteiro
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " de " + idade + " anos!\n" + 
				"Voc� nasceu em " + (2019 - i));
		
		
		
	}

}
