package view;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaVisualizar extends TelaPrincipal{

	private JScrollPane scroll;
	private JTextArea areaText;
	
	public TelaVisualizar(int largura, int altura, String txt) {
		super(largura, altura, txt);
		
		areaText = new JTextArea(12, 15);
		areaText.setEditable(false);
		scroll = new JScrollPane(areaText);		
			
		add(scroll);
		setVisible(false);
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JTextArea getAreaText() {
		return areaText;
	}

	public void setAreaText(JTextArea areaText) {
		this.areaText = areaText;
	}
}
