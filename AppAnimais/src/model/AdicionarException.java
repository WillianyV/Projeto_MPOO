package model;

import view.Mensagem;

public class AdicionarException extends Exception {
	public AdicionarException(String txt){
		Mensagem.mensagemExibir(txt);
	}
}
