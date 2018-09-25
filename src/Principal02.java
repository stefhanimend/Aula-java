import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal02 extends JFrame implements ActionListener {

	JMenuBar menu;
	JMenu menu1, menu2, menu3;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
	
	public Principal02() {
		
		setTitle("Menu");
		setResizable(false);
		setSize(500, 500);
		getContentPane().setBackground(new Color(255, 255, 255 ));
		setLayout(null);
		
		   menu1 = new JMenu("aluno");
		    m1 = new JMenuItem("incluir");
		    m1.addActionListener(this);
		    m2 = new JMenuItem("alterar");
		    m2.addActionListener(this);
		    m3 = new JMenuItem("excluir");
		    m3.addActionListener(this);
		    m4 = new JMenuItem("visualizar");
		    m4.addActionListener(this);
		    
		    menu1.add(m1);
		    menu1.add(m2);
		    menu1.add(m3);
		    menu1.add(m4);
		    
		 
		    menu2 = new JMenu("professor");
		    m5= new JMenuItem("incluir");
		    m5.addActionListener(this);
		    m6 = new JMenuItem("alterar");
		    m6.addActionListener(this);
		    m7 = new JMenuItem("excluir");
		    m7.addActionListener(this);
		    m8 = new JMenuItem("visualizar");
		    m8.addActionListener(this);
		    
		    menu2.add(m5);
		    menu2.add(m6);
		    menu2.add(m7);
		    menu2.add(m8);
		    
		    menu3= new JMenu("curso");
		    m9= new JMenuItem("incluir");
		    m9.addActionListener(this);
		    m10 = new JMenuItem("alterar");
		    m10.addActionListener(this);
		    m11 = new JMenuItem("excluir");
		    m11.addActionListener(this);
		    m12 = new JMenuItem("visualizar");
		    m12.addActionListener(this);
		    
		    menu3.add(m9);
		    menu3.add(m10);
		    menu3.add(m11);
		    menu3.add(m12);
		    
		    menu= new JMenuBar();
		    menu.add(menu1);
		    menu.add(menu2);
		    menu.add(menu3);
		    setJMenuBar(menu);
	}
	public static void main(String[] args) {
		new Principal02().setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==m1) {
		
			Inclusaoaluno obj=  new Inclusaoaluno();
			obj.setVisible(true);
			
			 
		}
		else if(e.getSource()==m2) {
			
			Alteraraluno obt = new Alteraraluno();
			obt.setVisible(true);
		}
		
	}
}
