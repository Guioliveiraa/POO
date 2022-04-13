package entities;

public class ClienteEspecial extends Cliente { //Classe ClienteEspecial filha de Cliente
	
	int area;
	public ClienteEspecial(String CPF, String nome, String end, int area) {// Classe ClienteEspecial com metodo construtor da classe pai
		
		super(CPF, nome, end);
	}

	public int getArea() {
		
		return area;
	}
	public void setArea(int area) {
		
		this.area = area;
	}
	
	public String toString() {
		return "Area: "
				+ area;
	}
}


