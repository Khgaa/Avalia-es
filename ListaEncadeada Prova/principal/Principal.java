package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.funcionario.Funcionario;
import br.ifba.edu.lista.ListaSimples;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ListaSimples l = new ListaSimples();
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			Funcionario f = new Funcionario();
			System.out.print("Digite o nome do funcionario: ");
			f.setNome(input.next());
			System.out.print("Digite o rg do funcionario: ");
			f.setRg(input.next());
			System.out.print("Digite a idade do funcionario: ");
			f.setIdade(input.next());
			System.out.println();
			l.adicionaNoComeco(f);
			
		}
		
		System.out.println(l.toString());
		System.out.println();
		l.quantidade();
		System.out.println();
		
		l.menu();
		
	}
}
