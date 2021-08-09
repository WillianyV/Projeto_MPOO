package sistema;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Validador implements KeyListener {
	
	
	public void validarCpf(JFormattedTextField txtcpf) {
		try{
			
		MaskFormatter formato = new javax.swing.text.MaskFormatter("###.###.###-##");
		txtcpf = new JFormattedTextField(formato);
		}catch(ParseException e1){
			e1.printStackTrace();
		}	
		
		txtcpf.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				String itens = "0123456789";

				if (!itens.contains(e.getKeyChar() + "")) {
					e.consume();
				}
			}
			public void keyReleased(KeyEvent arg0) {}
		
			public void keyPressed(KeyEvent arg0) {}
		});}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
