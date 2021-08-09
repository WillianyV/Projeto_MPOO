package model;

import java.util.ArrayList;

public class BaseDados {
	public static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static boolean addProduto(Produto produto){
		if(verificarProduto(produto)){
			produtos.add(produto);
			return true;
		}
		return false;
	}
	
	private static boolean verificarProduto(Produto produto){
		for(int i=0;i<produtos.size();i++){
			if(produto.getId() == produtos.get(i).getId()){
				return false;
			}
		}
		return true;
	}
	
	private static boolean editarProduto(int indice, Produto produto){
		produtos.set(indice, produto);
		return true;
	}
	
}


