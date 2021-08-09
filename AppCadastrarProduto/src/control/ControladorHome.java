package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Cadastro;
import view.Exibir;
import view.TelaInicial;

public class ControladorHome {
	TelaInicial homeView;
	public ControladorHome(TelaInicial homeView) {
		this.homeView = homeView;
	}
	
	public void controle(){
		homeView.getAddButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ControladorCadastro cCadastro = new ControladorCadastro(new Cadastro());	
				cCadastro.controle();
			}
		});
		homeView.getExibirButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ControladorExibir cExibir = new ControladorExibir(new Exibir());
				cExibir.controle();
			}
		});
	}
}
