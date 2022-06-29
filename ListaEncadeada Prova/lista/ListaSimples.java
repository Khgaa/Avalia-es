package br.ifba.edu.lista;

import javax.swing.JOptionPane;
import java.util.Scanner;

import br.ifba.edu.basica.Celula;
import br.ifba.edu.funcionario.Funcionario;

public class ListaSimples {
	
	private Celula cabeca;
	private Celula cauda;
	
	private int totalElementos = 0;
	
	Scanner in = new Scanner(System.in);
	
	public void adicionaNoComeco(Object obj) {
		
		Celula nova = new Celula(this.cabeca,obj);
		this.cabeca = nova;
		
		if(totalElementos == 0) {
			this.cauda = nova;
		}
		
		this.totalElementos++;
	}
	
    public void adicionaNoFinal(Object obj) {
		
		if(this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		} else {
			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;
		}
		
	}
    
    public boolean verificarPosicao(int pos) {
    	
    	return pos >= 0 && pos < this.totalElementos;
    }
    
    public void adicionaPosicao(int pos, Object obj) {
    	
    	if(!this.verificarPosicao(pos)) {
    		JOptionPane.showMessageDialog(null, "Posi��o inv�lida");
    		throw new IllegalArgumentException("A posi��o digitada � inv�lida");
    	}
	
    	Celula aux = this.cabeca;
    	
    	for(int cont = 0; cont < pos - 1; cont++) {
    		aux = aux.getProxima();
    	}
    	
    	Celula nova = new Celula(aux.getProxima(),obj);
    	aux.setProxima(nova);
        this.totalElementos++;
        
        }
    
    public void removerNoComeco() {
    	
    	Celula aux = this.cabeca;
    	this.cabeca = this.cabeca.getProxima();
    	aux.setProxima(null);
    	this.totalElementos--;
    }
    
    public void removerNoFinal() {
    	
    	Celula aux = this.cabeca;
		Celula ant = this.cauda;
		while (aux.getProxima() != null) {
			
			ant = aux;
			aux = aux.getProxima();
			
		}
		ant.setProxima(null);
		this.cauda = ant;
		this.totalElementos--;
    }
    
    public void removerPos(int pos, Object obj) {
    	
    	if(!this.verificarPosicao(pos)) {
    		JOptionPane.showMessageDialog(null, "Posi��o inv�lida");
    		throw new IllegalArgumentException("A posi��o digitada � inv�lida");
    	}
    	
        Celula aux = this.cabeca;
    	
    	for(int cont = 0; cont < pos - 1; cont++) {
    		aux = aux.getProxima();
    	}
    	
    	aux.setProxima(aux.getProxima().getProxima());
        this.totalElementos--;
    }
    
    public void quantidade() {
    	
    	System.out.println("N�mero de posi��es: " + this.totalElementos);
    }
    
	public String toString() {
		
		if(this.totalElementos == 0) {
			return"[]";
		}
		
		StringBuilder listaencadeada = new StringBuilder("["); 
		Celula atual = this.cabeca;
		
		for(int i = 0; i < this.totalElementos - 1; i++) {
			
			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
		}
		
		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");
		
		return listaencadeada.toString();
		}
	
	public void menu() {
		
		System.out.println("O que voc� deseja fazer?");
		System.out.println();
		System.out.println("Digite 0 para adicionar um funcion�rio no come�o");
		System.out.println("Digite 1 para adicionar um funcion�rio no final");
		System.out.println("Digite 2 para adicionar um funcion�rio em uma posi��o espec�fica");
		System.out.println("Digite 3 para remover o funcion�rio no come�o");
		System.out.println("Digite 4 para remover o funcion�rio no final");
		System.out.println("Digite 5 para remover um funcion�rio de uma posi��o espec�fica");
		System.out.println("Digite 6 para terminar");
		System.out.println();
		System.out.print("Digite um n�mero: ");
		int num = in.nextInt();
		System.out.println("");
		
		if(num == 0) {
			
			Funcionario f = new Funcionario();
			System.out.print("Digite o nome do funcionario: ");
			f.setNome(in.next());
			System.out.print("Digite o rg do funcionario: ");
			f.setRg(in.next());
			System.out.print("Digite a idade do funcionario: ");
			f.setIdade(in.next());
			System.out.println();
			adicionaNoComeco(f);
			System.out.println(toString());
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 1) {
			
			Funcionario f = new Funcionario();
			System.out.print("Digite o nome do funcionario: ");
			f.setNome(in.next());
			System.out.print("Digite o rg do funcionario: ");
			f.setRg(in.next());
			System.out.print("Digite a idade do funcionario: ");
			f.setIdade(in.next());
			System.out.println();
			adicionaNoFinal(f);
			System.out.println(toString());
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 2) {
			
			System.out.println("N�mero de posi��es: " + this.totalElementos);
			System.out.print("Digite o n�mero da posi��o que voc� quer adicionar: ");
			int pos = in.nextInt();
			
			Funcionario f = new Funcionario();
			System.out.print("Digite o nome do funcionario: ");
			f.setNome(in.next());
			System.out.print("Digite o rg do funcionario: ");
			f.setRg(in.next());
			System.out.print("Digite a idade do funcionario: ");
			f.setIdade(in.next());
			System.out.println();
			adicionaPosicao(pos, f);
			System.out.println(toString());
			quantidade();
			System.out.println();
			menu();
		}
		
		if(num == 3) {
			
			removerNoComeco();
			System.out.println(toString());
			System.out.println();
			quantidade();
			menu();
		}
		
		if(num == 4) {
			
			removerNoFinal();
			System.out.println(toString());
			System.out.println();
			quantidade();
			menu();
		}
		
		if(num == 5) {
			
			System.out.println("N�mero de posi��es: " + this.totalElementos);
			System.out.print("Digite o n�mero da posi��o que voc� quer remover: ");
			int pos2 = in.nextInt();
			
			removerPos(pos2, pos2);
			System.out.println(toString());
			System.out.println();
			quantidade();
			menu();
			
		}
		
		if(num == 6) {
			
			//System.out.println("Teste---");
		
			JOptionPane.showConfirmDialog(null, "Sistema desligado, tenha um bom dia!", null, JOptionPane.INFORMATION_MESSAGE);
			
	}

}
}
