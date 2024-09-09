package com.alunos.veiculos.entidade.carros;

import com.aluno.veiculos.entidade.servicos.Seguro;

public class Carro  extends Veiculo implements Seguro{
	private Seguro seguro;
	private double cilindrada;
	private boolean retrovisor;
	


	public Carro() {
	}
	public Carro(String placa, String renavam, String marca, double cilindrada, boolean retrovisor) {
		super(placa,renavam, marca);
		this.cilindrada = cilindrada;
		this.retrovisor = retrovisor;
	}

	@Override
	public void mostrar() {
		System.out.println("Caracteristicas do carro");
	}

	@Override
	public void seguroParticulas() {
		System.out.println("Seguro criado!");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Placa: " + super.marca +  " Ranavam: " + super.renavam + " Marca: " + this.cilindrada + " retrovisor: :" + this.retrovisor;
	}
}
