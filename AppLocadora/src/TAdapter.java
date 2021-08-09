import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class TAdapter extends KeyAdapter{
	
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()== KeyEvent.VK_ESCAPE){
			new Confirmar();
		}
		
	}
	public TAdapter() {
		
	}

}
