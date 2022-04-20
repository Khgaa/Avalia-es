package Hospital;

public class Paciente {
	
	String nome;
	String rg;
	String idade;
	
	public Paciente(String nome, String rg, String idade) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}
	
	public Paciente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", rg=" + rg + ", idade=" + idade + "]";
	}
	
	

}
