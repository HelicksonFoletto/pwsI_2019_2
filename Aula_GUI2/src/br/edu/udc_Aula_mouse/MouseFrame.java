package br.edu.udc_Aula_mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel;
	
	public MouseFrame() {
		super("Tratamento dos eventos de mouse");
		
		setSize(500,500); //definir tamanho da tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerrar execução quando precionado o close
		setLayout(new BorderLayout());
		
		
		mousePanel = new JPanel(); //painel em branco para capturar eventos do mouse
		add(mousePanel, BorderLayout.CENTER);
		
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		mousePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent event) { // Clicar com o mouse
				String detalhe;
				if(event.isMetaDown())// botão direito do mouse
					detalhe = "com botão direito";
				else if(event.isAltDown()) // botão do meio do mouse
					detalhe = "com botão no meio";
				else // botão esquerdo do mouse;
					detalhe = "com botão esquerdo";
				
				status.setText(String.format("Mouse foi \"clicado\" no ponto (%d , %d) %s",
						event.getX(), event.getY() ,detalhe)); 
				//captura e imprime o ponto da tela em que o mouse foi pressionado
				
			}

			@Override
			public void mousePressed(MouseEvent e) { //Clicar com o mouse sem soltar
				status.setText("Mouse foi pressionado");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) { // Soltar o botão do mouse
				status.setText("Mouse foi solto");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) { // Entra no painel com o mouse
				mousePanel.setBackground(Color.GREEN);
				
			}

			@Override
			public void mouseExited(MouseEvent e) { // Sair do painel com o mouse
				mousePanel.setBackground(Color.WHITE);
				
			} // Classe anonima
			
		});
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) { // Quando o mouse é arrastado
				status.setText(String.format("Mouse foi arrastado no ponto (%d ; %d)",
						event.getX(), event.getY() )); 
			}

			@Override
			public void mouseMoved(MouseEvent event) { // Quando o mouse é movido
				status.setText(String.format("Mouse foi movimentado no ponto(%d ; %d)",
						event.getX(), event.getY() )); 
			}
			
		});
		
		setVisible(true);
	}
	
	
}
