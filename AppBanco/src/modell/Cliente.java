package modell;

public class Cliente {
	
	private String cpf;
	private Corrente cc;
	private Poupanca pp;

	public Cliente(String cpf,String numero,String agencia, String senha) {
		this.cpf = cpf;
		cc = new Corrente(agencia, numero, senha, this);
		pp = new Poupanca(agencia, numero, senha, this);
	}
	

	public Cliente(String numero,String agencia, String senha) {
	
		cc = new Corrente(agencia, numero, senha, this);
		pp = new Poupanca(agencia, numero, senha, this);
	}
	
	public Cliente(String numero,String agencia) {
		
		cc = new Corrente(agencia, numero, this);
		pp = new Poupanca(agencia, numero, this);
	}
	
	
	public String toString() {
		return "Cliente [cpf=" + cpf + ", cc=" + cc + ", pp=" + pp + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Corrente getCc() {
		return cc;
	}

	public void setCc(Corrente cc) {
		this.cc = cc;
	}

	public Poupanca getPp() {
		return pp;
	}

	public void setPp(Poupanca pp) {
		this.pp = pp;
	}

	
}
