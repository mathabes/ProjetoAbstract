package br.com.fiap.beans;

public class Colaborador extends Pessoa {
	private String cargo;
	private double renda;
	
	public Colaborador() {
		super();
	}
	public Colaborador(String cargo, double renda) {
		super();
		this.cargo = cargo;
		this.renda = renda;
	}
	public Colaborador(String nome, int idade, String cpf, String rg, String cargo, double renda) {
		super(nome, idade, cpf, rg);
		this.cargo = cargo;
		this.renda = renda;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public String identificacao() {
		return "Colaborador";
	}
	
}
