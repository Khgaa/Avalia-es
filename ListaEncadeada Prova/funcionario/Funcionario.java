package br.ifba.edu.funcionario;

public class Funcionario {
	
	String nome;
	String cpf;
	String rg;
	String idade;
	
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + "]";
	}
	
	public Funcionario(String nome, String cpf, String rg, String idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}
	
	public Funcionario() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
