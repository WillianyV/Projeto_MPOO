package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import view.Log;

public class Historico {
	
	public static void salvarOp(String num1,String num2, String resultado){
		FileWriter file;
		BufferedWriter escrever;
		try {
			file = new FileWriter(new File("historico.txt"),true);
			escrever = new BufferedWriter(file);
			
			escrever.write(num1+Operacao.verificarOp()+num2+" = "+resultado);
			escrever.newLine();
			escrever.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo(){
		FileReader leitor;
		BufferedReader br;
		String linha = "";
		
		try {
			leitor = new FileReader("historico.txt");
			br = new BufferedReader(leitor);
			Log.setLog(linha);
			linha=br.readLine();
			while (linha!=null) {
				Log.setLog(Log.getLog()+"\n"+linha);
				linha=br.readLine();
			}
			
		} catch (Exception e) {System.out.println("Ops");}
		
	}

}
