package com.alunos.veiculos.entidade.carros;

import java.lang.Thread.Builder.OfVirtual;

public abstract class Veiculo {
	public String placa;
	public String renavam;
	public String marca;
	
	public Veiculo(String placa, String renavam, String marca) {
		this.placa = placa;
		this.renavam = renavam;
		this.marca = marca;
	}
	
	public Veiculo() {}
	
	public void  mostrar() {
		System.out.println("Este é um veiculo");
	}

}
