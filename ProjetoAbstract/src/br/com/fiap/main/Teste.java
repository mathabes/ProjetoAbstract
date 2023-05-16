package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;

public class Teste {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		Colaborador objCo = new Colaborador(texto("Nome"),
				inteiro("Idade"),
				texto("CPF"),
				texto("RG"),
				texto("Cargo"),
				real("Renda mensal"));
		Cliente objCl = new Cliente(texto("Nome do cliente"),
				inteiro("Idade do cliente"),
				texto("CPF"),
				texto("RG"),
				inteiro("Digite o número de cadastro"),
				texto("Forma de pagamento"));
		
		System.out.println("Cliente" +
				"\nNome: " + objCl.getNome() +
				"\nPagamento: " + objCl.getTipoPag() +
				"\n\nColaborador" +
				"\nNome: " + objCo.getNome() +
				"\nCargo: " + objCo.getCargo());

	}
		
}
