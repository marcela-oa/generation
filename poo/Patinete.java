package br.com.generation.poo;

public class Patinete {

	private String cor;
	private String tamanho;
	private double velocidade;
	private int rodas;
	
	public void anda () {
		if (this.velocidade > 0) {
			System.out.println("Está andando!");
		} else {
			System.out.println("Está parado.");
		}
	}
	
	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int rodas () {
		switch (tamanho) {
			case "pequeno":
				return rodas = 2;
			case "médio":
				return rodas = 2;
			case "grande":
				return rodas = 3;
			default:
				return rodas = 2;
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
}
