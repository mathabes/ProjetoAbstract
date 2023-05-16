package br.com.fiap.beans;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, String cpf, String rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public abstract String identificacao();
	
}
