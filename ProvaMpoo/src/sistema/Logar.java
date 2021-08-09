package sistema;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logar extends JFrame{
	JLabel loginCpf, senha;
	JTextField textLogin; 
	JPasswordField textSenha; 
	JButton add, sair;
	
	public Logar(){
	
	super("Logar");
	setSize(200, 150);		
	setLocationRelativeTo(null);
	setLayout(new FlowLayout());
	setResizable(false);
	loginCpf = new JLabel("CPF");
	add(loginCpf);
	textLogin = new JTextField(12);
	add(textLogin);
	senha = new JLabel("Senha");
	add(senha);
	textSenha = new JPasswordField(12);
	add(textSenha);
	add = new JButton("Add");
	add(add);
	sair= new JButton("Sair");
	add(sair);
	
			
	setVisible(true);
	
	
	}

}
