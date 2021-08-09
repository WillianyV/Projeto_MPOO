package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends TelaPrincipal {

	private ButtonGroup grupoSexo;
	private JRadioButton  gatoRadio, cachorroRadio;
	private JLabel nomeLabel, racaLabel, idadeLabel, pesoLabel,mensagemLabel;
	private JTextField nomeField, racaField, idadeField, pesoField;
	private JButton addButton;
	
	public TelaCadastro(int largura, int altura, String txt) {
		super(largura, altura, txt);
		
		grupoSexo = new ButtonGroup();
		gatoRadio = new JRadioButton("Gato");
		cachorroRadio = new JRadioButton("Cachorro");
		nomeLabel = new JLabel("Nome: ");
		nomeField = new JTextField(10);
		racaLabel = new JLabel("Raca: ");
		racaField = new JTextField(10);
		idadeLabel = new JLabel("Idade: ");
		idadeField = new JTextField(10);
		pesoLabel = new JLabel("Peso: ");
		pesoField = new JTextField(10);
		mensagemLabel = new JLabel("Todos os campos são obrigatórios");
		addButton = new JButton("Add");
		
		add(gatoRadio);
		add(cachorroRadio);
		grupoSexo.add(gatoRadio);
		grupoSexo.add(cachorroRadio);
		add(nomeLabel);
		add(nomeField);
		add(racaLabel);
		add(racaField);
		add(idadeLabel);
		add(idadeField);
		add(pesoLabel);
		add(pesoField);
		add(mensagemLabel);
		add(addButton);
		
		
		setVisible(false);
	}

	public ButtonGroup getGrupoSexo() {
		return grupoSexo;
	}

	public JRadioButton getGatoRadio() {
		return gatoRadio;
	}

	public JRadioButton getCachorroRadio() {
		return cachorroRadio;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getRacaField() {
		return racaField;
	}

	public JTextField getIdadeField() {
		return idadeField;
	}

	public JTextField getPesoField() {
		return pesoField;
	}

	public JButton getAddButton() {
		return addButton;
	}

}
