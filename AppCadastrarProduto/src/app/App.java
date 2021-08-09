package app;
import view.TelaInicial;
import control.ControladorHome;
import view.Cadastro;
import view.Exibir;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorHome cHome = new ControladorHome(new TelaInicial());
		cHome.controle();
		
	}

}
