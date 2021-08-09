package view;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import modell.Cliente;

public class TelaTransferencia extends Tela{

	private JLabel clienteLabel,cpfLabel,origemLabel,agenciaLabel,numeroLabel,saldoLabel,valorSLabel,
				   destinoLabel,agenciaDLabel,numeroDLabel, quantoLabel,valorQLabel;
	private JLabel nAgenciaLabel,nNumeroLabel;
	private ButtonGroup origemGroup,detinoGroup;
	private JRadioButton ccORadioButton,cpORadioButton,ccDRadioButton,cpDRadioButton;
	private JTextField agenciaField, numeroField,valorField;
	private JButton continuarButton; 
	
	public TelaTransferencia(int largura, int altura, String txt) {
		super(largura, altura, txt);
		
		clienteLabel = new JLabel("Cliente");
		cpfLabel = new JLabel("");
		origemLabel = new JLabel("   Origem  ");
		agenciaLabel = new JLabel("Agência:");
		nAgenciaLabel = new JLabel("");
		numeroLabel = new JLabel("Nímero:");
		nNumeroLabel = new JLabel("");
		origemGroup = new ButtonGroup();
		ccORadioButton = new JRadioButton("Conta Corrente",true);
		cpORadioButton = new JRadioButton("Conta Poupanca");
		saldoLabel = new JLabel("Saldo");
		valorSLabel = new JLabel("");
		destinoLabel = new JLabel("     Destino    ");
		detinoGroup = new ButtonGroup();
		ccDRadioButton = new JRadioButton("Conta Corrente",true);
		cpDRadioButton = new JRadioButton("Conta Poupanca");
		agenciaDLabel = new JLabel("Agência:");
		agenciaField = new JTextField(5);
		numeroDLabel = new JLabel("Número:");
		numeroField = new JTextField(5);
		quantoLabel = new JLabel("      Quanto?    ");
		valorQLabel = new JLabel("Valor");
		valorField = new JTextField(5);
		continuarButton = new JButton("Continuar");
		
		add(clienteLabel);
		add(cpfLabel);
		add(origemLabel).setFont(new Font("Arial", Font.BOLD, 18));
		add(agenciaLabel);
		add(nAgenciaLabel);
		add(numeroLabel);
		add(nNumeroLabel);
		add(ccORadioButton);
		add(cpORadioButton);
		origemGroup.add(ccORadioButton);
		origemGroup.add(cpORadioButton);
		add(saldoLabel);
		add(valorSLabel);
		add(destinoLabel).setFont(new Font("Arial", Font.BOLD, 18));;
		add(ccDRadioButton);
		add(cpDRadioButton);
		detinoGroup.add(ccDRadioButton);
		detinoGroup.add(cpDRadioButton);
		add(agenciaDLabel);
		add(agenciaField);
		add(numeroDLabel);
		add(numeroField);
		add(quantoLabel).setFont(new Font("Arial", Font.BOLD, 18));;
		add(valorQLabel);
		add(valorField);
		add(continuarButton);

		
		setVisible(false);
	}
	
	public void atualizaLabels(Cliente cliente){
		cpfLabel.setText(cliente.getCpf());
		nAgenciaLabel.setText(cliente.getPp().getAgencia());
		nNumeroLabel.setText(cliente.getPp().getNumero());
		valorSLabel.setText(Double.toString(cliente.getPp().getSaldo()));
	}

	public JLabel getClienteLabel() {
		return clienteLabel;
	}

	public void setClienteLabel(JLabel clienteLabel) {
		this.clienteLabel = clienteLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public void setCpfLabel(JLabel cpfLabel) {
		this.cpfLabel = cpfLabel;
	}

	public JLabel getOrigemLabel() {
		return origemLabel;
	}

	public void setOrigemLabel(JLabel origemLabel) {
		this.origemLabel = origemLabel;
	}

	public JLabel getAgenciaLabel() {
		return agenciaLabel;
	}

	public void setAgenciaLabel(JLabel agenciaLabel) {
		this.agenciaLabel = agenciaLabel;
	}

	public JLabel getNumeroLabel() {
		return numeroLabel;
	}

	public void setNumeroLabel(JLabel numeroLabel) {
		this.numeroLabel = numeroLabel;
	}

	public JLabel getSaldoLabel() {
		return saldoLabel;
	}

	public void setSaldoLabel(JLabel saldoLabel) {
		this.saldoLabel = saldoLabel;
	}

	public JLabel getValorSLabel() {
		return valorSLabel;
	}

	public void setValorSLabel(JLabel valorSLabel) {
		this.valorSLabel = valorSLabel;
	}

	public JLabel getDestinoLabel() {
		return destinoLabel;
	}

	public void setDestinoLabel(JLabel destinoLabel) {
		this.destinoLabel = destinoLabel;
	}

	public JLabel getAgenciaDLabel() {
		return agenciaDLabel;
	}

	public void setAgenciaDLabel(JLabel agenciaDLabel) {
		this.agenciaDLabel = agenciaDLabel;
	}

	public JLabel getNumeroDLabel() {
		return numeroDLabel;
	}

	public void setNumeroDLabel(JLabel numeroDLabel) {
		this.numeroDLabel = numeroDLabel;
	}

	public JLabel getQuantoLabel() {
		return quantoLabel;
	}

	public void setQuantoLabel(JLabel quantoLabel) {
		this.quantoLabel = quantoLabel;
	}

	public JLabel getValorQLabel() {
		return valorQLabel;
	}

	public void setValorQLabel(JLabel valorQLabel) {
		this.valorQLabel = valorQLabel;
	}

	public JLabel getnAgenciaLabel() {
		return nAgenciaLabel;
	}

	public void setnAgenciaLabel(JLabel nAgenciaLabel) {
		this.nAgenciaLabel = nAgenciaLabel;
	}

	public JLabel getnNumeroLabel() {
		return nNumeroLabel;
	}

	public void setnNumeroLabel(JLabel nNumeroLabel) {
		this.nNumeroLabel = nNumeroLabel;
	}

	public ButtonGroup getOrigemGroup() {
		return origemGroup;
	}

	public void setOrigemGroup(ButtonGroup origemGroup) {
		this.origemGroup = origemGroup;
	}

	public ButtonGroup getDetinoGroup() {
		return detinoGroup;
	}

	public void setDetinoGroup(ButtonGroup detinoGroup) {
		this.detinoGroup = detinoGroup;
	}

	public JRadioButton getCcORadioButton() {
		return ccORadioButton;
	}

	public void setCcORadioButton(JRadioButton ccORadioButton) {
		this.ccORadioButton = ccORadioButton;
	}

	public JRadioButton getCpORadioButton() {
		return cpORadioButton;
	}

	public void setCpORadioButton(JRadioButton cpORadioButton) {
		this.cpORadioButton = cpORadioButton;
	}

	public JRadioButton getCcDRadioButton() {
		return ccDRadioButton;
	}

	public void setCcDRadioButton(JRadioButton ccDRadioButton) {
		this.ccDRadioButton = ccDRadioButton;
	}

	public JRadioButton getCpDRadioButton() {
		return cpDRadioButton;
	}

	public void setCpDRadioButton(JRadioButton cpDRadioButton) {
		this.cpDRadioButton = cpDRadioButton;
	}

	public JTextField getAgenciaField() {
		return agenciaField;
	}

	public void setAgenciaField(JTextField agenciaField) {
		this.agenciaField = agenciaField;
	}

	public JTextField getNumeroField() {
		return numeroField;
	}

	public void setNumeroField(JTextField numeroField) {
		this.numeroField = numeroField;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public void setValorField(JTextField valorField) {
		this.valorField = valorField;
	}

	public JButton getContinuarButton() {
		return continuarButton;
	}

	public void setContinuarButton(JButton continuarButton) {
		this.continuarButton = continuarButton;
	}
	
}
