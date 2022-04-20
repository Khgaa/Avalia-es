package Hospital;

import java.util.Arrays;
import java.util.Scanner;

public class ColecaoPaciente {
	
	Paciente vetor[] = new Paciente[5];
	Paciente p = new Paciente();
	Scanner in = new Scanner(System.in);
	int aux = 0;
	
	public void aumentaVetor() {
		
		Paciente newVetor[] = new Paciente[this.vetor.length + 1];
		
		System.arraycopy(this.vetor, 0, newVetor, 0, this.vetor.length);
		
		this.vetor = newVetor;
	}
	
	public void add() {
		
		
		int cont;
		
		for(cont = 0; cont < vetor.length;cont++) {
			
			Paciente p = new Paciente();
			
			System.out.println("Digite o nome do paciente: ");
			p.setNome(in.next());
			
			System.out.println("Digite o rg do paciente: ");
			p.setRg(in.next());
			
			System.out.println("Digite a idade do paciente: ");
			p.setIdade(in.next());
			
			vetor[cont] = p;
		}
		


		this.aux = cont;
		aumentaVetor();
		
	}
	
	public void list() {
		
		System.out.println(Arrays.toString(vetor));
	}
	
	public void search() {
		
		System.out.println("Digite o nome do paciente que você quer procurar: ");
		String nome = in.next();
		
		for(int cont = 0; cont < this.aux;cont++) {
			
			if(nome.equals(vetor[cont].getNome())) {
				
				System.out.println("Nome:" + vetor[cont].getNome());
				System.out.println("Rg:" + vetor[cont].getRg());
				System.out.println("Idade:" + vetor[cont].getIdade());
			}
		}
		
	}
	
	public void addPos() {
		
		
		System.out.println("Digite a posição que você deseja adicionar um novo paciente: ");
		int pos = in.nextInt();
		
		
		
		for(int cont = aux - 1;cont < pos;cont--) {
	
			
			this.vetor[cont+1] = vetor[cont];
			
		}
		
		Paciente p = new Paciente();
		
		
		System.out.println("Digite o nome do paciente: ");
		p.setNome(in.next());
		
		System.out.println("Digite o rg do paciente: ");
		p.setRg(in.next());
		
		System.out.println("Digite a idade do paciente: ");
		p.setIdade(in.next());
		
		this.vetor[pos] = p;
		
		this.aux++;
		
		
	}
	
	public void quantidade() {
		
		System.out.println("A quantidade de pacientes é de: " + this.aux);
	}
	
	public void remove() {
		
		System.out.println("Digite a posição que você deseja remover da lista: ");
		int pos = in.nextInt();
		
		for(int cont = aux - 1;cont == pos;cont--) {
			
			this.vetor[cont] = null;
			
		
	}
		this.aux--;

}
	
}
