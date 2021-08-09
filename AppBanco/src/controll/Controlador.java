package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modell.Banco;
import modell.CampoVazioE;
import modell.Cliente;
import modell.Corrente;
import modell.Poupanca;
import modell.UsuarioExpcetion;
import view.Mensagem;
import view.TelaLogin;
import view.TelaTransferencia;

public class Controlador implements ActionListener{

	private TelaTransferencia telaTransferencia;
	private TelaLogin telaLogin;

	public Controlador(TelaTransferencia telaTransferencia, TelaLogin telaLogin) {
		this.telaTransferencia = telaTransferencia;
		this.telaLogin = telaLogin;

		telaLogin.getEntrarButton().addActionListener(this);
		telaLogin.getSairButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		telaTransferencia.getContinuarButton().addActionListener(this);
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaLogin.getEntrarButton()){
			Cliente c = new Cliente(telaLogin.getContaField().getText(), telaLogin.getAgenciaField().getText(),
					telaLogin.getSenhaField().getText());

			try {
				if(Banco.validarUsuario(c)){
					Mensagem.mensagemExibir("ehehehehhee!!!");
					telaLogin.setVisible(false);

					telaTransferencia.atualizaLabels(Banco.getClientes().get(Banco.getJ()));

					telaTransferencia.setVisible(true);

				}
			} catch (CampoVazioE | UsuarioExpcetion e1) {


			}

		}

		if(e.getSource() == telaTransferencia.getContinuarButton()){
			
			if(telaTransferencia.getCcORadioButton().isSelected()){
				if(telaTransferencia.getCcDRadioButton().isSelected()){
					
					Cliente contaCliente = new Cliente(telaTransferencia.getNumeroField().getText(), telaTransferencia.getAgenciaField().getText());
					
					Banco.transferir(Double.parseDouble(telaTransferencia.getValorField().getText()), 
							Banco.getClientes().get(Banco.getJ()).getCc(), contaCliente.getCc(), 1);
				}else{

				}
			}else{
				if(telaTransferencia.getCcDRadioButton().isSelected()){

				}else{

				}
			}
		}


	}




}
