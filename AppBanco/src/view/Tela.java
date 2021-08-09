package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class Tela extends JFrame {

	public Tela(int largura, int altura, String txt){
		super(txt);
		setSize(largura, altura);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
	}
}
