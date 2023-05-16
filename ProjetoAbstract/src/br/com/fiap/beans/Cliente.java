package br.com.fiap.beans;

public class Cliente extends Pessoa{
	private int cadastro;
	private String tipoPag;
	public Cliente() {
		super();
	}
	public Cliente(int cadastro, String tipoPag) {
		super();
		this.cadastro = cadastro;
		this.tipoPag = tipoPag;
	}
	public Cliente(String nome, int idade, String cpf, String rg, int cadastro, String tipoPag) {
		super(nome, idade, cpf, rg);
		this.cadastro = cadastro;
		this.tipoPag = tipoPag;
	}
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public String getTipoPag() {
		return tipoPag;
	}
	public void setTipoPag(String tipoPag) {
		this.tipoPag = tipoPag;
	}
	
	public String identificacao() {
		return "Cliente";
	}
	
}
