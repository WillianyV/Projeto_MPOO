package modell;

public abstract class Conta {
	private String agencia,numero, senha;
	private double saldo;
	
	public Conta(String agencia, String numero, String senha,  Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.senha = senha;
		this.saldo = 0;
	}

	public Conta(String agencia2, String numero2, Cliente cliente) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", senha=" + senha + ", saldo=" + saldo + "]";
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
