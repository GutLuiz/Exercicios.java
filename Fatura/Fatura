package Conta;

public class Fatura {
	private int numero;
	private int quantidade;
	private double preço;

	public Fatura(int numero, int quantidade, double preço) {
		this.numero = numero;
		this.quantidade = quantidade;
		this.preço = preço;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public double getTotalFatura() {
		return this.quantidade * this.preço;
	}

	public String toString() {
		return "O numero da fatura, " + numero + " , na quantidade de " + quantidade + " unidades no preço de: $"
				+ String.format("%.2f", preço) + " cada!";

	}

}
