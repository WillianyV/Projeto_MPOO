package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaPrincipal extends JFrame {
	
	public TelaPrincipal(int largura, int altura, String txt){
		super(txt);
		setSize(largura,altura);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
}
