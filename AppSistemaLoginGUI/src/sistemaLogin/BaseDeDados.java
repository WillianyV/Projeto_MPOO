package sistemaLogin;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BaseDeDados {
	public static ArrayList <Usuario> users = new ArrayList<Usuario>();
	
	public void  addUser(Usuario user){
		if(verificar(user.getLogin())){
			users.add(user);
		}else{
			System.out.println("Usuario já existe!");
		}
	}
	
	public static boolean verificar(String login){
		for(int i=0;i<users.size();i++){
			if(login.equals(users.get(i))){
				return false;
			}		
		}
	return true;			
	}
	
}
