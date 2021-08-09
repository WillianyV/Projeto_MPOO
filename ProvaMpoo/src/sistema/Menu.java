package sistema;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener{
	JButton cadastrar, logar, sair; 
	Cadastrar cadastro;
	Logar login;
	
	public Menu(){
		super("Menu");
		setSize(350, 70);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		cadastrar = new JButton("Cadastrar");
		add(cadastrar);
		cadastrar.addActionListener(this);
		logar = new JButton("Logar");
		add(logar);
		logar.addActionListener(this);
		sair = new JButton("Sair");
		add(sair);
		sair.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent evento) {
				int i = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar a aplicação?");
				if (i == 0){
					System.exit(0);
				
			}
		}
		});
		setVisible(true);
		
	}


	public void actionPerformed(ActionEvent evento) {
		
		if (evento.getSource()==cadastrar){
			this.setVisible(false);
			new Cadastrar();
			 
			 
		}
		if (evento.getSource()==logar){
			this.setVisible(false);
			new Logar();
		}
	}
	
	}

