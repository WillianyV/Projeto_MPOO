

public class DVD {
	private String codigo;
	private String nome;
	private String autor;
	private String genero;
	private String numFaixas;
			
	public DVD(String codigo, String nome, String autor, String genero, String numFaixas){
		this.codigo = codigo;
		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
		this.numFaixas = numFaixas;
				
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(String numFaixas) {
		this.numFaixas = numFaixas;
	}
	
	
	

}
