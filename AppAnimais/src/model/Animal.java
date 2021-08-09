package model;

public class Animal {

	private boolean gato,cachorro;
	private String nome, raca;
	private int idade;
	private double peso;
	
	public Animal(boolean gato, boolean cachorro, String nome, String raca, int idade, double peso) {

		this.gato = gato;
		this.cachorro = cachorro;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public boolean isGato() {
		return gato;
	}

	public void setGato(boolean gato) {
		this.gato = gato;
	}

	public boolean isCachorro() {
		return cachorro;
	}

	public void setCachorro(boolean cachorro) {
		this.cachorro = cachorro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
}
