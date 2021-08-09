package model;

import view.Mensagens;

public class ExcecaoZero extends Exception{
	public ExcecaoZero() {
		Mensagens.exibir("Não é possível divisão por 0");
	}
}
