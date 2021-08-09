package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {
	private JLabel idLabel,nomeLabel,precoLabel,validadeLabel;
	private JTextField idField,nomeField,precoField,validadeField;
	private JButton cadastrarButton,homeButton;
	
	public Cadastro(){
		super("CADASTRO");
		setSize(200,200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		idLabel = new JLabel("ID:              ");
		nomeLabel = new JLabel("NOME:      ");
		precoLabel = new JLabel("PREÇO:     ");
		validadeLabel = new JLabel("VALIDADE");
		
		idField = new JTextField(10);
		nomeField = new JTextField(10);
		precoField = new JTextField(10);
		validadeField = new JTextField(10);
		
		cadastrarButton = new JButton("CADASTRAR");
		homeButton = new JButton("HOME");
		
		setLayout(new FlowLayout());
		add(idLabel);
		add(idField);
		add(nomeLabel);
		add(nomeField);
		add(precoLabel);
		add(precoField);
		add(validadeLabel);
		add(validadeField);
		add(cadastrarButton);
		add(homeButton);
		setVisible(true);
	}

	public JLabel getIdLabel() {
		return idLabel;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getPrecoLabel() {
		return precoLabel;
	}

	public JLabel getValidadeLabel() {
		return validadeLabel;
	}

	public JTextField getIdField() {
		return idField;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JTextField getValidadeField() {
		return validadeField;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getHomeButton() {
		return homeButton;
	}
	
	
	
}
