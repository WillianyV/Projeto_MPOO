package model;

import view.Mensagens;

public class ExcecaoZero extends Exception{
	public ExcecaoZero() {
		Mensagens.exibir("N�o � poss�vel divis�o por 0");
	}
}
