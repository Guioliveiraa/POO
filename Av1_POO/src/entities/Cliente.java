package entities;

public class Cliente { //Classe cliente
	
	private String CPF, nome, end;


	public Cliente(String CPF,String nome,String end) { //metodo construtor para classe cliente
	
		this.CPF = CPF;
		this.nome = nome;
		this.end = end;
	}
	
	public Cliente(String CPF,String nome) { //metodo construtor para classe cliente
		
		this.CPF = CPF;
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	public String toString() {
		return "Name: "
				+ nome
				+ ", CPF: "
				+ CPF
				+ ", End: $ "
				+ end;
	}
}
