import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Cadastro extends JFrame{
	
	private JButton add;
	private JLabel login, senha, dataNascimento;
	private JTextField textLogin, textDataNasc;
	private JPasswordField textSenha;
	
	ArrayList<Usuario> usuario;
	 
	
	public Cadastro(){
		
		super("Cadastro");
		setSize(200, 170);		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setResizable(false);
		
		login = new JLabel("Login:");
		textLogin = new JTextField(10);
		senha = new JLabel("Senha:");
		textSenha = new JPasswordField(10);
		dataNascimento = new JLabel("Aniversário:");
		textDataNasc = new JTextField(10);
		
		
		add(login);
		add(textLogin);
		add(senha);
		add(textSenha);
		add(dataNascimento);
		add(textDataNasc);
		
		add = new JButton("Add");
		add(add);
		add.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				//new Cadastro();
				setVisible(false);
				
				
			}
		});
		
		
		setVisible(true);
		
		
	}

}
