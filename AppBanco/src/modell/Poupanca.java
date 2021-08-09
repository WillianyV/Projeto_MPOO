package modell;

public class Poupanca extends Conta{

	private int dv;
	
	public Poupanca(String agencia, String numero, String senha, Cliente cliente) {
		super(agencia, numero, senha, cliente);
		
	}

	public Poupanca(String agencia, String numero,  Cliente cliente) {
		super(agencia, numero,cliente);
		
	}
	
	public void renderJuros(){
		setSaldo(getSaldo()*Banco.getTaxaPP());
	}
}
