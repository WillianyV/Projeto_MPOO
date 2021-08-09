package app;

import model.ThreadLog;
import view.Log;
import view.Tela;

public class App {
	public static void main(String[] args) {
		new Tela();
		new Log();
		new ThreadLog().start();
	}
}
