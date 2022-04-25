package entities;

public class Pedido {
	private String numero;
	private String data;
	private double valor;
	StatusPedido situacao;
	Cliente clientes;
	
	public Pedido(String numero, String data, double valor, Cliente clientes, StatusPedido situacao) { //metodo construtor para classe cliente
		
		this.numero = numero;
		this.data = data;
		this.valor = valor;
		this.clientes = clientes;
		
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return clientes;
	}
	
	public Cliente setCliente(Cliente clientes) {
		return this.clientes = clientes;
	}

	public StatusPedido getSituacao() {
		return situacao;
	}

	public void setSituacao(StatusPedido situacao) {
		this.situacao = situacao;
	}
	
	public String toString() {
		return "Numero: "
				+ numero
				+ ", Data: "
				+ data
				+ ", Valor: $ "
				+ valor
				+ "Situacao: "
				+ situacao;
	}
}
