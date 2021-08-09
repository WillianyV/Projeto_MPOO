package modell;

import view.Mensagem;

public class CampoVazioE  extends Exception{

	public  CampoVazioE(){
		
		Mensagem.mensagemExibir("Campos vazios");

	}
}
