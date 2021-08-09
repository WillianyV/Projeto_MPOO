import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
JButton cadastrar, logar, salvar, sair;
	
	
	public  Menu() {
		super("Menu");
		setSize(450, 70);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		cadastrar = new JButton("Cadastrar");
		add(cadastrar);
		cadastrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new Cadastro();
				setVisible(false);
				
				
			}
		});
		
		logar = new JButton("Logar");
		add(logar);
		logar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new Cadastro();
				new Log();
				setVisible(false);
				
				
			}
		});
		
		salvar = new JButton("Salvar");
		add(salvar); 
		salvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Backup();
				
			}
		});
		sair = new JButton("Sair");
		add(sair); 
		sair.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		this.addKeyListener(new TAdapter());
		setVisible(true);
		
	}		
	

}
