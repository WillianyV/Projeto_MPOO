package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.ControladorCalc;

public class Tela extends JFrame{
	private JLabel num1Label, num2Label,resultadoLabel,operacaoLabel;
	private JTextField num1Field,num2Field,resultado;
	private JRadioButton divisaoRadio, somaRadio, adicaoRadio, multipRadio,subRadio;
	private ButtonGroup operacao;
	
	public Tela(){
		super("Calculadora");
		setSize(600,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		
		operacao = new ButtonGroup();
		num1Label = new JLabel("Digite o 1º valor:");
		num2Label = new JLabel("Digite o 2º valor:");
		resultadoLabel = new JLabel("Resultado:");
		num1Field = new JTextField(40);
		num2Field = new JTextField(40);
		resultado = new JTextField(43);
		divisaoRadio = new JRadioButton("Divisão");
		subRadio = new JRadioButton("Subtração");
		adicaoRadio = new JRadioButton("Adição");
		multipRadio = new JRadioButton("Multiplicação");
		ControladorCalc controle = new ControladorCalc(this);
		
		add(num1Label);
		add(num1Field);
		add(num2Label);
		add(num2Field);
		add(resultadoLabel).addKeyListener(controle);;
		add(resultado).addKeyListener(controle);;
		add(divisaoRadio).addKeyListener(controle);;
		add(subRadio).addKeyListener(controle);;
		add(adicaoRadio).addKeyListener(controle);;
		add(multipRadio).addKeyListener(controle);;
		operacao.add(divisaoRadio);
		operacao.add(subRadio);
		operacao.add(adicaoRadio);
		operacao.add(multipRadio);
		setFocusable(true);
		
		addKeyListener(controle);
		setVisible(true);		
	}

	public JTextField getNum1Field() {
		return num1Field;
	}

	public JTextField getNum2Field() {
		return num2Field;
	}

	public JTextField getResultado() {
		return resultado;
	}

	public JRadioButton getDivisaoRadio() {
		return divisaoRadio;
	}

	public JRadioButton getSomaRadio() {
		return somaRadio;
	}

	public JRadioButton getAdicaoRadio() {
		return adicaoRadio;
	}

	public JRadioButton getMultipRadio() {
		return multipRadio;
	}

	public JRadioButton getSubRadio() {
		return subRadio;
	}

	public ButtonGroup getOperacao() {
		return operacao;
	}

	public void setResultado(JTextField resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
}
