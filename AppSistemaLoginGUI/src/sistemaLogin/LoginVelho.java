package sistemaLogin;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginVelho  {
	JFrame frame;
	JLabel loginLabel,senhaLabel;
	JTextField loginField,senhaField;
	JButton entrarButton;
	
	
	public LoginVelho(){
		frame = new JFrame("Login");
		frame.setLocationRelativeTo(null);
		frame.setSize(200, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		loginLabel = new JLabel("Login:");
		senhaLabel = new JLabel("Senha:");
		
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		entrarButton = new JButton("Entrar");
		
		frame.add(loginLabel);
		frame.add(loginField);
		frame.add(senhaLabel);
		frame.add(senhaField);
		frame.add(entrarButton);
		
		frame.setVisible(true);
		JOptionPane.showMessageDialog(null, "Entrou");
		JOptionPane.showConfirmDialog(null, "Quer apagar os dados?");
		
	}
}
