package br.edu.udc_LinhaRetOval;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinhaRetOval extends JFrame{
	private static final long serialVersionUID = 1L;

	Painel painel;
	
	public LinhaRetOval ( ) {
		super("Desenhando formas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new BorderLayout());
		
		painel = new Painel();
		add(painel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main (String [] args) {
		new LinhaRetOval();
	}

}

class Painel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); /*pedir pra super class se desenhar, colocando seus componentes padrão */
		
		this.setBackground(Color.WHITE); // pedindo para alterar o fundo do JPanel para branco
		
//		g.setColor(Color.RED); 
//		g.drawLine(5, 30, 380, 30); // desenhar a linha
		
//		g.setColor(Color.BLACK);
//		g.drawRect(5, 40, 90, 55); // desenha um retangulo 
//		g.fillRoundRect(195, 40, 90, 55, 5, 50); //desenha retangulo preenchido
//		g.drawRoundRect(290, 40, 90, 55, 20, 20); // desenha um retangulo com bordas aredondado
	
		g.setColor(Color.RED);
		g.drawOval(195, 100, 90, 55); // desenhar um circulo
		g.fillOval(290, 100, 90, 55); // desenhar um circulo preenchido
		
//		g.setColor(Color.CYAN);
//		g.fillRoundRect(195, 40, 90, 55, 50, 50); //
//		g.drawRoundRect(290, 40, 90, 55, 20, 20);
		
		//inicia em 0 e varre 360 graus
//		g.setColor(Color.RED); 
//		g.drawRect(15, 35, 80, 80);
//		g.setColor(Color.BLACK); 
//		g.drawArc(15, 35, 80, 80, 0, 360);
		
		//inicia em 0 e varre 110 graus
//		g.setColor(Color.RED); 
//		g.drawRect(100, 35, 80, 80);
//		g.setColor(Color.BLACK); 
//		g.drawArc(100, 35, 80, 80, 0, 110);
		
		//inicia em 0 e varre -270 graus
//		g.setColor(Color.RED); 
//		g.drawRect(185, 35, 80, 80);
//		g.setColor(Color.BLACK); 
//		g.drawArc(185, 35, 80, 80, 0, -270);
		
		//inicia em 0 e varre 360 graus
//		g.fillArc(15, 120, 80, 40, 0, 360);
		//inicia em 270 e varre ate  -90
//		g.fillArc(100, 120, 80, 40, 270, -90);
		//inicia em 0 e varre até -270 graus
//		g.fillArc(185, 120, 80, 40, 0, -270);
		
		//desenhar o poligono com objeto Polygon
//		int xValues[] = {20, 40, 50 ,30 ,20,15};
//		int yValues[] = {50, 50, 60, 80, 80, 60};
//		Polygon polygon1 = new Polygon(xValues, yValues, 6);
//		g.drawPolygon(polygon1);
		
		//desenhar polilinhas com dois arrays
//		int xValues2[] = {70, 90, 100, 80, 70, 65,60};
//		int yValues2[] = {100, 100, 110, 110, 130, 110, 90};
//		g.drawPolyline(xValues2, yValues2, 7);
	}
	
}
