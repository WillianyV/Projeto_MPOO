

import javax.swing.JOptionPane;



public class Confirmar {

	public Confirmar(){
		int i = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar a aplica��o?");
		if (i == 0){
			System.exit(0);
	}
	}
}
