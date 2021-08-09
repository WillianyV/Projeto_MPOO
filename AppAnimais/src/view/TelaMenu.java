package view;

import javax.swing.JButton;

public class TelaMenu extends TelaPrincipal {
	
	private JButton cadastrarButton, visualizarButton, salvarButton, sairButton;
	
	public TelaMenu(int largura, int altura, String txt) {
		super(largura, altura, txt);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cadastrarButton = new JButton("Cadastrar");
		visualizarButton = new JButton("Visualizar");
		salvarButton = new JButton("Salvar");
		sairButton = new JButton("Sair");
		
		add(cadastrarButton);
		add(visualizarButton);
		add(salvarButton);
		add(sairButton);
		
		setVisible(true);
		
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getVisualizarButton() {
		return visualizarButton;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

}
