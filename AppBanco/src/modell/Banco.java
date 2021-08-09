package modell;

import java.util.ArrayList;

public class Banco implements Operacoes{
	private static int j,z;
	private static double taxaCC, taxaPP;
	private static ArrayList<Cliente>clientes = new ArrayList<Cliente>();

	public static boolean depositar(double valor, Conta conta) {
		conta.setSaldo(conta.getSaldo() + valor);
		return true;
	}

	public static boolean sacar(double valor, Conta conta) {
		if(conta.getSaldo() < valor){
			return false;
		}else{
			conta.setSaldo(conta.getSaldo()-valor);
			return true;
		}
	}

	public static boolean transferir(double valor, Conta contaOrigem, Conta contaDestino, int num){

		if(verificarUsuario(contaDestino)){

			switch (num) {
			case 1:
				if(sacar(valor,clientes.get(j).getCc())){
					depositar(valor, clientes.get(z).getCc());
					return true;
				}
				break;

			default:
				break;
			}
		}
		return false;	

	}

	public static boolean verificarUsuario(Conta cliente){
		z= -1;
		for(Cliente c : clientes){
			if(c.getPp().getNumero().equals(cliente.getNumero())){
				z++;
				return true;
			}
		}
		return false;	
	}

	public static void addCliente(Cliente cliente){
		clientes.add(cliente);
	}

	public static boolean validarUsuario(Cliente cliente) throws CampoVazioE, UsuarioExpcetion{
		j=-1;
		if((cliente.getPp().getAgencia().equals("")) &&
				(cliente.getPp().getSenha().equals("")) &&
				(cliente.getPp().getNumero().equals(""))){

			throw new CampoVazioE();
		}

		for(int i=0; i < clientes.size(); i++){
			if(cliente.getPp().getNumero().equals(clientes.get(i).getPp().getNumero())
					&& cliente.getPp().getSenha().equals(clientes.get(i).getPp().getSenha())){
				j++;
				return true;

			}
		}
		throw new UsuarioExpcetion();

	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente> clientes) {
		Banco.clientes = clientes;
	}

	public static double getTaxaCC() {
		return taxaCC;
	}

	public static void setTaxaCC(double taxaCC) {
		Banco.taxaCC = taxaCC;
	}

	public static double getTaxaPP() {
		return taxaPP;
	}

	public static void setTaxaPP(double taxaPP) {
		Banco.taxaPP = taxaPP;
	}

	public static int getJ() {
		return j;
	}

	public static void setJ(int j) {
		Banco.j = j;
	}

	public static int getZ() {
		return z;
	}

	public static void setZ(int z) {
		Banco.z = z;
	}



}
