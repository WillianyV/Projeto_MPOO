package sistemaLogin;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JLabel loginLabel,senhaLabel;
	JTextField loginField,senhaField;
	JButton entrarButton;
	JButton sairButton;
	
	
	public Login(){
		super("Login");
		setLocationRelativeTo(null);
		setSize(200, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		loginLabel = new JLabel("Login:");
		senhaLabel = new JLabel("Senha:");
		
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		
		entrarButton = new JButton("Entrar");
		entrarButton.addActionListener(this);
		sairButton = new JButton("Sair");
		sairButton.addActionListener(this);
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(sairButton);
		
		setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==entrarButton){
			for(int i=0;i<BaseDeDados.users.size();i++){
				if((loginField.getText().equals(BaseDeDados.users.get(i).getLogin())) && (senhaField.getText().equals(BaseDeDados.users.get(i).getSenha()))){
					JOptionPane.showMessageDialog(null, "Logado com sucesso","Autenticado",JOptionPane.ERROR_MESSAGE);
				}else if(BaseDeDados.verificar(loginField.getText())){
					JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta!","Erro",JOptionPane.ERROR_MESSAGE);
				}
	
			}
				
		}else{
			System.exit(EXIT_ON_CLOSE);
		}
			
		
	}
}
