package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import view.Mensagem;

public class BaseDeDados {

	public static ArrayList<Animal>animais = new ArrayList<>();

	public static boolean addNoArrayListAnimais(Animal animal) throws AdicionarException{
		if(!verificarAnimal(animal)){
			animais.add(animal);
			return true;
		}else{
			try {
				throw new AdicionarException("Animal já cadastrado");
			} catch (Exception e) {
				Mensagem.mensagemExibir("Erro ao apresentar a exececão");
			}
		return false;
		}
	}

	public static boolean verificarAnimal(Animal animal){
		for(int i=0; i< animais.size(); i++){
			if(animal.getNome().equals(animais.get(i).getNome())){
				return true;
			}
		}
		return false;		
	}
	
	public static void salvarDados(){
		try {
			FileWriter arquivo = new FileWriter(new File("arquivo.txt"));
			BufferedWriter escrever = new BufferedWriter(arquivo);
			
			for(int j=0; j < animais.size();j++){
				escrever.write(animais.get(j).getNome());
				escrever.newLine();
			}						
			escrever.close();
		} catch (Exception e) {
			Mensagem.mensagemExibir("Erro ao salvar");
		}
	}
	
	public static void salvarAtomaticamente(){
		while(true){
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				Mensagem.mensagemExibir("Erro ao salvar");
			}
			salvarDados();
		}
	}
}
