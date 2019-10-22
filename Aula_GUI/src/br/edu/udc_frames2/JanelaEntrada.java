package br.edu.udc_frames2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JanelaEntrada extends JFrame{

	private static final long serialVersionUID = 1L;

	public JanelaEntrada() {
		super("Janela com campos de entrada");		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout());
		
		//add(new JLabel("Digite algo: "));
		//add(new JTextField(10));
		/*campo de texto para solicitar informa��es do usu�rio, normalmente � seguido por
		uma v�riavel para capturar os dados.*/
		
		add(new JLabel("Qual � o seu nome?"));
		JTextField nome = new JTextField(20);
		nome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(nome, "Ol� " + nome.getText() + " tudo bem?");
			}
		});
		add(nome);
		/* Adiciona o nome numa frase ap�s o usu�rio precionar enter*/
		
		add(new JTextField("Digite algo aqui",20));
		
		
		JTextField textField = new JTextField("Campo n�o edit�vel");
		textField.setEditable(false); 
		add(textField);
		/* cria uma caixa de dialogo n�o edit�vel pelo usu�rio */
		
		
		add(new JLabel("Digite uma senha:"));
		//add(new JPasswordField(20));
		JPasswordField password = new JPasswordField(20);
		password.setToolTipText("Uma dica para o campo de senha...");
		/*campo para gerar um lembrede para senhas. Dicas */
		password.addActionListener(new TextFieldHandler());
		/*vincula a class abaixo. Objetivo � ao pressionar enter � ativado o evento onde
		 * a senha � mostrada
		 */		
		add(password);
		/* campo para digita��o de senhas, j� vem com a implementa��o de esconder
		 * o que se � digitado. 
		 * */
		
		JButton button = new JButton ("Comando");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed( ActionEvent arg0) {
				String senha = new String(password.getPassword());
				JOptionPane.showMessageDialog(null, 
						nome.getText() + " sua senha �:\n " + senha);
			}
		});
		add(button);
		/* Criar caixa de dialogo para aparecer o nome do individuo e a senha logo em seguida
		 * se precionar o bot�o adicionado */
		
		
		setVisible(true);
		
	}
	class TextFieldHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
		 	String str = new String (((JPasswordField)event.getSource()).
		 			getPassword()); 
		 	/*programar um evento para chamar uma caixa de dialogo
		 	apartir de um evento do usu�rio. */
			
		 	JOptionPane.showMessageDialog(null, str); /*apenas mostra a string digitada na caixa */
		}
		
		
	}
}
