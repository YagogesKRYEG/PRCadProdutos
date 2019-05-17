package com.PRCadProdutos.dominio;

public class Produtos {
	private int Id;
	private String Nome;
	private String Descricao;
	private String Fabricante;
	private int Quantidade;
	private double preco;
	public Produtos() {
	}
	public Produtos(int id, String nome, String descricao, String fabricante, int quantidade, double preco) {
		Id = id;
		Nome = nome;
		Descricao = descricao;
		Fabricante = fabricante;
		Quantidade = quantidade;
		this.preco = preco;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
