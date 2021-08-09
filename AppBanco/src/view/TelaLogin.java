package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin  extends Tela{

	private JLabel agenciaLabel, contaLabel,senhaLabel;
	private JTextField agenciaField, contaField,senhaField;
	private JButton entrarButton, sairButton;
	
	public TelaLogin(int largura, int altura, String txt) {
		super(largura, altura, txt);
		setUndecorated(true);
		
		agenciaLabel = new JLabel("Agencia");
		agenciaField = new JTextField(7);
		contaLabel = new JLabel("Conta   ");
		contaField = new JTextField(7);
		senhaLabel = new JLabel("Senha  ");
		senhaField = new JTextField(7);
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		add(agenciaLabel);
		add(agenciaField);
		add(contaLabel);
		add(contaField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(sairButton);
		
		setVisible(true);
	}

	public JTextField getAgenciaField() {
		return agenciaField;
	}

	public JTextField getContaField() {
		return contaField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}
