package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Produto;
import model.BaseDados;
import view.Cadastro;
import view.TelaInicial;

public class ControladorCadastro {
		Cadastro cadastroView;
		public ControladorCadastro(Cadastro cadastroView) {
			this.cadastroView= cadastroView;
		}
		public void controle(){
			cadastroView.getCadastrarButton().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(BaseDados.addProduto(new Produto(Integer.parseInt(cadastroView.getIdField().getText()),
							cadastroView.getNomeField().getText(),Double.parseDouble(cadastroView.getPrecoField().getText()),
							cadastroView.getValidadeField().getText()))){
						JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
						//cadastroView.setVisible(false);
						cadastroView.getNomeField().setText(null);
						cadastroView.getIdField().setText(null);
						cadastroView.getPrecoField().setText(null);
						cadastroView.getValidadeField().setText(null);
					}else{
						JOptionPane.showMessageDialog(null, "Erro no cadastro");
					}
					
				}
			});
			cadastroView.getHomeButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cadastroView.setVisible(false);
					
				}
			});
		}
}
