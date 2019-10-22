package br.edu.udc_frames;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Janela() {
		super("Título da janela");
//		setLayout(new FlowLayout()); //organiza as mensagens na tela na hora de execução de forma padrão
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel ("mensagem na janela!");
		this.add(label,BorderLayout.CENTER);
//		this.add(label); // adiciona mensagem na tela de forma padrão
		JLabel label2 = new JLabel ("nova mensagem na janela!");
//		this.add(label2); // adiciona mensagem na tela de forma padrão
		this.add(label2,BorderLayout.NORTH);
		
		/* BorderLayout divide a tela em 5 partes, norte, sul, leste, oeste. 
		 *  ______________ 
		 *  |     N      |
		 *  |____________| 
		 *  || O|  C | L |
		 *  ||__|____|___|
		 *  |     S      | 
		 *  |____________|
		 *  */
		
	}
}
