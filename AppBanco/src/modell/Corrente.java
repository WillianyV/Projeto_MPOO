package modell;


public class Corrente extends Conta{

	private double SaldoDevedor;

	public Corrente(String agencia, String numero, String senha, Cliente cliente) {
		super(agencia, numero, senha,cliente);

	}

	public Corrente(String agencia, String numero,  Cliente cliente) {
		super(agencia, numero, cliente);

	}
	
	public void correrJuros(){
		if(getSaldo()!= 0){
			if(getSaldo() > 0){
				setSaldo(getSaldo()*(Banco.getTaxaCC()));
			}else{
				setSaldo(getSaldo()-getSaldo()*(Banco.getTaxaCC()));
			}

		}
	}

	public void atualizarSaldo(){
		
	}
	
}
