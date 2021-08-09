package sistemaLogin;

public class App {

	public static void main(String[] args) {
		
		BaseDeDados b = new BaseDeDados();
		Pessoa p = new Pessoa("Elvis","1234");
		b.addUser(p);
		new Login();
	}

}
