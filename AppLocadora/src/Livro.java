

public class Livro {
	
	private String codigo;
	private String nome;
	private String autor;
	private String editora;
	private String volume;
	private String ano;
	
	public Livro(String c, String nome, String autor, String editora, String vol, String ano){
		this.codigo = c;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.volume = vol;
		this.ano = ano;
	
		
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
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getVolume() {
		return volume;
	}
	
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	

}
