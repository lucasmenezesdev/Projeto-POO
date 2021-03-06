package models;

import java.io.Serializable;

public class Livro implements Serializable{
	private int id;
	private int estoque;
	private Double preco;
	private String nome;
	private String autor;
	private String categoria;
	
	
	public Livro() {}
	
	public Livro(int id, int estoque, Double preco, String nome, String autor, String categoria) {
		this.setId(id);
		this.setEstoque(estoque);
		this.setPreco(preco);
		this.setNome(nome); 
		this.setAutor(autor);
		this.setCategoria(categoria);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
