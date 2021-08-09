package control;

import model.BaseDados;
import model.Produto;
import view.Exibir;

public class ControladorExibir {
	Exibir exibirView;
	
	public ControladorExibir(Exibir exibirView){
		this.exibirView = exibirView;
	}
	
	public void controle(){
		int posicao=0;
		for(Produto produto : BaseDados.produtos){
			exibirView.dados[posicao][0] = Integer.toString(produto.getId());
			exibirView.dados[posicao][1] = produto.getNome();
			exibirView.dados[posicao][2] = Double.toString(produto.getPreco());
			exibirView.dados[posicao][3] = produto.getValidade();
			posicao++;
		}
		
	}
}
