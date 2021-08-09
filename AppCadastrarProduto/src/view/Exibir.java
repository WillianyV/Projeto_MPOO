package view;

import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.BaseDados;
import model.Produto;

public class Exibir  extends JFrame{

	private JTable tabela;
	
	public String[] colunas = {"ID","NOME","PREÇO","VALIDADE"};
	public String [][] dados = new String[BaseDados.produtos.size()][4];
	
	public Exibir(){
		super("Exibir");
		setSize(500,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
		
		
		tabela = new JTable(dados,colunas);
		JScrollPane barraRolagem = new JScrollPane(tabela);
		
		
		add(barraRolagem);
		
		
		setVisible(true);
		
	}

	public JTable getTabela() {
		return tabela;
	}

	public ScrollPane getScroll() {
		return getScroll();
	}
	

}
