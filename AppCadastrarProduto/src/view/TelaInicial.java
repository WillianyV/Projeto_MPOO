package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaInicial extends JFrame {
	private JButton addButton,exibirButton;	
	
	public TelaInicial(){
		super("Inicio");
		setSize(200,200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addButton = new JButton("ADD");
		exibirButton = new JButton("EXIBIR");
		
		setLayout(new FlowLayout());
	
		add(addButton);
		add(exibirButton);
		
		
		
		setVisible(true);
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getExibirButton() {
		return exibirButton;
	}
	
	
}
