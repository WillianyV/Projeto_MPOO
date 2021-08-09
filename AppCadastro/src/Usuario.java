
public class Usuario {
	
	private String login, senha, dataNascimento;
	
	
	public Usuario(String login, String senha, String dataNascimento){
		
		this.login = login;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
			
		
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
