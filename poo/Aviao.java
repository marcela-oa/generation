package br.com.generation.poo;

public class Aviao {

	private String modelo;
	private String tipo;
	private double velocidade;
	private int capacidadeDeCarga;
	
	public void voa () {
		if (this.velocidade > 0) {
			System.out.println("O avião está voando!");
		} else {
			System.out.println("O avião está parado.");
		}
	}
	
	public void cargaMaxima () {
		switch (tipo) {
		case "particular":
			System.out.println("O avião particular pode carregar até 50.000 kg.");
			break;
		case "comercial":
			System.out.println("O avião comercial pode carregar até 200.000 kg.");
			break;
		case "militar":
			System.out.println("O avião militar pode carregar até 500.000 kg.");
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
}
