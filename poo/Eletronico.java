package br.com.generation.poo;

public class Eletronico {
	
	private String tipo;
	private int bateria;
	private double horasDeUso;
	private double horasCarregando;
	
	public void gastaBateria () {
		if (this.bateria > 0) {
			bateria -= (int)(horasDeUso * 4.17);
			
			if (this.bateria < 0) {
				System.out.println("0%");
			} else {
				System.out.println(bateria + "%");
			}
		} else {
			System.out.println("0%");
		}
	}
	
	public int getBateria() {
		return bateria;
	}
	
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getHorasDeUso() {
		return horasDeUso;
	}

	public void setHorasDeUso(double horasDeUso) {
		this.horasDeUso = horasDeUso;
	}

	public double getHorasCarregando() {
		return horasCarregando;
	}

	public void setHorasCarregando(double horasCarregando) {
		this.horasCarregando = horasCarregando;
	}

	public void carregaBateria () {
		if (this.bateria < 100) {
			bateria += (int)(horasCarregando * 30);
			
			if (this.bateria > 100) {
				System.out.println("100%");
			} else {
				System.out.println(bateria + "%");
			}
		} else {
			System.out.println("100%");
		}
	}
}
