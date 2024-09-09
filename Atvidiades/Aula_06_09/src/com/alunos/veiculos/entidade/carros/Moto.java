package com.alunos.veiculos.entidade.carros;

public class Moto extends Veiculo {
	private boolean radiador;
	private double cilindrada;
	private boolean retrovisor;
	
	
	
	public Moto(String string, String string2, String string3, boolean b, double d, boolean c) {}
	@Override
	public void mostrar() {
		System.out.println("Essa é uma moto");
		
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Placa: " + super.marca +  " Ranavam: " + super.renavam + " Marca: " + this.cilindrada + " retrovisor: :" + this.retrovisor;
	}

}
