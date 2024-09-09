package com.alunos.veiculos.entidade.entity;

import com.alunos.veiculos.entidade.carros.Moto;
import com.alunos.veiculos.entidade.carros.Veiculo;

public class Scooter extends Moto{
	public String tipoApoioDePe;
	public int maximaVelocidade;
	private boolean tranmissaoCVT;

	
	public Scooter(String string, String string2, String string3, boolean b, double d, boolean c, int maximaVelocidade, String tipoApoioPe, boolean transmissao) {
		super(string, string2, string3, b, d, c);
		this.tipoApoioDePe = tipoApoioPe;
		this.maximaVelocidade = maximaVelocidade;
		this.tranmissaoCVT = transmissao;
	}

	
	public void  Scooter() {
	}
	


}
