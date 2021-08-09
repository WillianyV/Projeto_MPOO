import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
	private JButton cadastrar, logar, salvar, sair;
	
	
	public Menu(){
		super("Menu");
		setSize(500,150);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		cadastrar = new JButton("Cadastrar");
		cadastrar = new JButton("Logar");
		cadastrar = new JButton("Salvar");
		cadastrar = new JButton("Sair");
		
		add(cadastrar);
		add(logar);
		add(salvar);
		add(sair);
		
		setVisible(true);
		
		
	}

}
