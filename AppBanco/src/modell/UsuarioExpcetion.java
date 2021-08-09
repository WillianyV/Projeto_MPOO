package modell;

import view.Mensagem;

public class UsuarioExpcetion extends Exception{

	public UsuarioExpcetion(){
		Mensagem.mensagemExibir("Erro ao logar");
	}
}
