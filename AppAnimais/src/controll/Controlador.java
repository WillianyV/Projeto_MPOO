package controll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.omg.PortableServer.ThreadPolicyOperations;

import model.AdicionarException;
import model.Animal;
import model.BaseDeDados;
import view.Mensagem;
import view.TelaCadastro;
import view.TelaMenu;
import view.TelaVisualizar;

public class Controlador implements ActionListener{

	private TelaMenu telaMenu;
	private TelaCadastro telaCadastro;
	private TelaVisualizar telaVisualizar;
	
	public Controlador(TelaMenu telaMenu, TelaCadastro telaCadastro, TelaVisualizar telaVisualizar) {
		this.telaMenu = telaMenu;
		this.telaCadastro = telaCadastro;
		this.telaVisualizar = telaVisualizar;
		
		telaMenu.getCadastrarButton().addActionListener(this);
		telaMenu.getVisualizarButton().addActionListener(this);
		telaMenu.getSalvarButton().addActionListener(this);
		telaMenu.getSairButton().addActionListener(this);
		
		telaCadastro.getAddButton().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		//TELA MENU:
		if(e.getSource() == telaMenu.getSairButton()){
			System.exit(0);
		}
		if(e.getSource() == telaMenu.getCadastrarButton()){
			telaCadastro.setVisible(true);
		}
		if(e.getSource() == telaMenu.getVisualizarButton()){
			//TELA VISUALIZAR
			String srt = "";
			String var = "Dados Animais";
			
			for(Animal animal: BaseDeDados.animais){
				if(animal.isGato() == true){
					srt += "\n\nGATO\n" + "Nome: " + animal.getNome() + "\nIdade: " + animal.getIdade() +
							"\nRaca: " + animal.getRaca() + "\nPeso: " + animal.getPeso();
				}else{
					srt += "\n\nCACHORRO\n" + "Nome: " + animal.getNome() + "\nIdade: " + animal.getIdade() +
							"\nRaca: " + animal.getRaca() + "\nPeso: " + animal.getPeso();
				}
			}
			var+=srt;
			
			telaVisualizar.getAreaText().setText(var);
			telaVisualizar.setVisible(true);
		}
		if(e.getSource() == telaMenu.getSalvarButton()){
			BaseDeDados.salvarDados();
			Mensagem.mensagemExibir("Arquivos salvos com sucesso!");
		}
		//TELA CADASTRO:
		if(e.getSource() == telaCadastro.getAddButton()){
			try {
				BaseDeDados.addNoArrayListAnimais(new Animal(
						telaCadastro.getGatoRadio().isSelected(),
						telaCadastro.getCachorroRadio().isSelected(),
						telaCadastro.getNomeField().getText(),
						telaCadastro.getRacaField().getText(),
						Integer.parseInt(telaCadastro.getIdadeField().getText()),
						Double.parseDouble(telaCadastro.getPesoField().getText())));
					Mensagem.mensagemExibir("Cadastrado com sucesso!");
								
			} catch (AdicionarException e1) {			
				
				e1.printStackTrace();
			}
			
			//LIMPAR DADOS:
			telaCadastro.getNomeField().setText(null);
			telaCadastro.getRacaField().setText(null);
			telaCadastro.getIdadeField().setText(null);
			telaCadastro.getPesoField().setText(null);
		}
		
	}
	
	
}
