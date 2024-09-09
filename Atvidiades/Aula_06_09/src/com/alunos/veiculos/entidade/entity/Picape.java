package com.alunos.veiculos.entidade.entity;

import com.alunos.veiculos.entidade.carros.Carro;
import com.alunos.veiculos.entidade.carros.Moto;
import com.alunos.veiculos.entidade.carros.Veiculo;

public class Picape extends Carro {
	public String tipoCarroceria;
	public double capacidadeDeCarga;
	public Picape(String placa, String renavam, String marca,double cilindrada, boolean retrovisor, String tipoCarroceira, double capacidade) {
		super(placa, renavam, marca, cilindrada, retrovisor );
		this.capacidadeDeCarga = capacidade;
		this.tipoCarroceria = tipoCarroceira;
	}
	
	
	@Override
	public void mostrar() {
		
	}
	


}
