

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaCadastroCatalogo {
	
	static ArrayList<Livro> livro;
	static ArrayList<DVD> dvd; 

	
	public void validarCaracter(KeyEvent event, JTextField field){
		try{
			int num = Integer.parseInt(event.getKeyText(event.getKeyCode()));
		}catch(NumberFormatException exc){
			exc.getStackTrace();
			JOptionPane.showMessageDialog(null, "Insira apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
			if (field.getText().length()<=1){
				field.setText("");
			}else{	
				field.setText(field.getText().substring(0, (field.getText().length()-1)));
			}
		}
	
	}
	
	
	
}