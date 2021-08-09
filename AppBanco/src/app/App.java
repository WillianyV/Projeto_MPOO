package app;

import controll.Controlador;
import modell.Banco;
import modell.Cliente;
import view.Mensagem;
import view.TelaLogin;
import view.TelaTransferencia;

public class App extends Thread{

	public void run() {
		super.run();
		while(true){
			try {
				Thread.sleep(5000);
				for(int i=0; i < Banco.getClientes().size();i++){
					Banco.getClientes().get(i).getCc().correrJuros();
					Banco.getClientes().get(i).getPp().renderJuros();
				}
			} catch (InterruptedException e) {
				Mensagem.mensagemExibir("ERRO");
			}
		}

	}

	public static void main(String[] args) {
		
		TelaLogin telaLogin = new TelaLogin(150, 120, "");
		TelaTransferencia telaTransferencia = new TelaTransferencia(150, 430, "Transferencia");
		Banco.addCliente(new Cliente("111.111.111-11","00001-0", "0001-0", "1111"));
		Banco.addCliente(new Cliente("000.000.000-00","00002-0", "0002-0", "2222"));
		
		Banco.depositar(1000, Banco.getClientes().get(0).getCc());
		
		Controlador controll = new Controlador(telaTransferencia, telaLogin);
	}
}
