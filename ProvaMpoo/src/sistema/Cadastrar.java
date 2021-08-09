package sistema;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Cadastrar extends JFrame{
	JLabel login, cpf, senha;
	JTextField textLogin, textCpf; 
	JPasswordField textSenha; 
	JButton add, sair;
	
	public Cadastrar(){
		super("Cadastrar");
		setSize(200, 150);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		login = new JLabel("Login");
		add(login); 
		textLogin = new JTextField(12);
		add(textLogin);
		cpf = new JLabel("CPF");
		add(cpf);
		textCpf = new JTextField(12);
		add(textCpf);
		senha = new JLabel("Senha");
		add(senha);
		textSenha = new JPasswordField(12);
		add(textSenha);
		add = new JButton("Add");
		add(add);
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Adicionar");
				
			}
		});
		sair= new JButton("Sair");
		add(sair);
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Menu();
				
			}
		});
		
				
		setVisible(true);
		
	}

}
