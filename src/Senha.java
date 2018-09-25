import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Senha extends JFrame {
	private JTextField usuario;
	private JPasswordField senha;
	private JButton login, limpa;
	private JLabel user, pass;
	JLabel recado = new JLabel("Login");
	ImageIcon fundo = new ImageIcon(getClass().getResource("senhamaqquiagem.jpg"));
	
	public Senha() {
		
		recado.setFont(new Font("arial", Font.BOLD,5));
		recado.setIcon(fundo);
		setResizable(false);
		setSize(500, 500);
		getContentPane().setBackground(new Color(255, 255, 255 ));
	
		setLayout(null);
		setLayout(new FlowLayout());
		
		user = new JLabel("Usuário: ");
		add(user);
		
		usuario = new JTextField(15);
		add(usuario);
		
		pass = new JLabel("Senha:   ");
		add(pass);
		
		senha = new JPasswordField(15);
		add(senha);
		
		login = new JButton("Entrar");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == login) {
					if(usuario.getText().equals("admin") && senha.getText().equals("12345")) {
						Principal02 obj= new Principal02();
				        obj.setVisible(true);
					}
					
					else
						JOptionPane.showMessageDialog(null, "Senha errada! Estude Java!");
				}
			}
		 }
		);
		add(login);
		
		limpa = new JButton("Limpar");
		limpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == limpa){
					usuario.setText("");
					senha.setText("");
				}
			}
		 }
		);
		add(limpa);
	}
	
	public static void main(String[] args) {
		new Senha().setVisible(true);
	}

	}



	