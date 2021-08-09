import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaInicial extends JFrame {
	
	
	JButton cadastrar, salvar, sair;
	
	
	public  TelaInicial() {
		
		setSize(230, 100);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		cadastrar = new JButton("Cadastrar");
		add(cadastrar);
		cadastrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro();
				setVisible(false);
				
				
			}
		});
		
		salvar = new JButton("Salvar");
		add(salvar); 
		salvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sair = new JButton("Sair");
		add(sair); 
		sair.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				new Confirmar();
				
			}
		});
		
		this.addKeyListener(new TAdapter());
		setVisible(true);
		
	}		
		
	
}
