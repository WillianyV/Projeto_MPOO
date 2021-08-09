package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.ExcecaoZero;
import model.Historico;
import model.Operacao;
import view.Mensagens;
import view.Tela;

public class ControladorCalc implements KeyListener{
	Tela tela;

	public ControladorCalc(Tela tela) {
		this.tela=tela;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ENTER){
			if(tela.getDivisaoRadio().isSelected() || tela.getSubRadio().isSelected() || 
					tela.getAdicaoRadio().isSelected() || tela.getMultipRadio().isSelected()){
				if(tela.getDivisaoRadio().isSelected()){
					Operacao.setTipoOp(1);
				}else if(tela.getSubRadio().isSelected()){
					Operacao.setTipoOp(2);
				}else if(tela.getAdicaoRadio().isSelected()){
					Operacao.setTipoOp(3);
				}else{
					Operacao.setTipoOp(4);
				}
			}else{
				Mensagens.exibir("Escolha uma operação");
			}
			
			try {
				
				tela.getResultado().setText((Double.toString(Operacao.efetuarOp(Double.parseDouble(tela.getNum1Field().getText()),
					Double.parseDouble(tela.getNum2Field().getText())))));
				Historico.salvarOp(tela.getNum1Field().getText(), tela.getNum2Field().getText(), tela.getResultado().getText());
			}catch (Exception e1) {}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}