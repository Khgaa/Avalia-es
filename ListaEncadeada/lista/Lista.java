package lista;

import javax.swing.JOptionPane;

import basica.Celula;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	
	private int totalElementos = 0;
	
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
    		JOptionPane.showMessageDialog(null, "Posição inválida");
    		throw new IllegalArgumentException("A posição digitada é inválida");
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
    	
    	Celula aux = this.cauda;
    	this.cauda = null;
    	this.totalElementos--;
    }
    
    public void removerPos(int pos, Object obj) {
    	
    	if(!this.verificarPosicao(pos)) {
    		JOptionPane.showMessageDialog(null, "Posição inválida");
    		throw new IllegalArgumentException("A posição digitada é inválida");
    	}
    	
        Celula aux = this.cabeca;
    	
    	for(int cont = 0; cont < pos - 1; cont++) {
    		aux = aux.getProxima();
    	}
    	
    	Celula nova = new Celula(aux.getProxima(),obj);
    	aux.setProxima(null);
        this.totalElementos--;
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
		
		
	}

}
