package br.com.lead.modelo;

public class Filme {
	
	private String nome;
	private String genero;
	private Integer ano;
	

	public Filme(String nome, String genero, Integer ano) {
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
		
	}
	
	
	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}
}
