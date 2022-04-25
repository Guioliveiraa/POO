package entities;

public class Item {

	private int sequencial;
	double qtd;
	Produto prod;
	Pedido ped;


	public Item(int sequencial,double qtd,Produto prod, Pedido ped) { 
	
		this.sequencial = sequencial;
		this.qtd = qtd;
		this.prod = prod;
		this.ped = ped;
	}
	


	public int getSequencial() {
		return sequencial;
	}


	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}


	public double getQtd() {
		return qtd;
	}


	public void setQtd(double qtd) {
		this.qtd = qtd;
	}


	public Produto getProd() {
		return prod;
	}


	public void setProd(Produto prod) {
		this.prod = prod;
	}


	public Pedido getPed() {
		return ped;
	}


	public void setPed(Pedido ped) {
		this.ped = ped;
	}
	public String toString() {
		return "Sequencial: "
				+ sequencial
				+ ", qtd: "
				+ qtd
				+ ", Pedido: $ "
				+ ped
				+ ", Produto: $ "
				+ prod;
	}	
}

