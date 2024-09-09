package com.alunos.veiculos.entidade.entity;

import com.alunos.veiculos.entidade.carros.Moto;
import com.alunos.veiculos.entidade.carros.Veiculo;

public class Motocros extends Moto  {
	private String tipoSuspensao;
	private String tipoGuindon;
	
	public  Motocros(String placa, String renavam , String marca, boolean radiador, double cilindrada, boolean retrovisor, String tipoSuspensao, String tipoGuidon) {
		super(placa, renavam,  marca,radiador , cilindrada, retrovisor);
		this.tipoGuindon = tipoGuidon;
		this.tipoSuspensao = tipoSuspensao;
		
	}
	

	
	
}
