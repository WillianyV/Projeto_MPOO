package app;

import controll.Controlador;
import model.AdicionarException;
import model.Animal;
import model.BaseDeDados;
import view.Mensagem;
import view.TelaCadastro;
import view.TelaMenu;
import view.TelaVisualizar;

public class App {
	public static void main(String[] args) {

		try {
			BaseDeDados.addNoArrayListAnimais(new Animal(true, false, "Linda", "rua", 2, 3));
			BaseDeDados.addNoArrayListAnimais(new Animal(true, false, "Eu", "rua", 2, 3));
			
		} catch (AdicionarException e) {
			Mensagem.mensagemExibir("Erro ao adicionar animais");
		}
		
		TelaMenu telaMenu = new TelaMenu(400, 70, "Menu");
		TelaCadastro telaCadastro = new TelaCadastro(180, 220, "Cadastro");
		TelaVisualizar telaVisualizar = new TelaVisualizar(200, 260, "Visualizar");
		
		Controlador controll = new Controlador(telaMenu, telaCadastro, telaVisualizar);
		
		BaseDeDados.salvarAtomaticamente();
	}
}
