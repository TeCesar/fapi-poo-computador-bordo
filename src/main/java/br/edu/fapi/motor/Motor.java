package br.edu.fapi.motor;

public class Motor {
	private String modeloMotor;
	private int quilometragemMotor;
	private int quilometrosPorLitro;
	
	public String getModeloMotor() {
		return modeloMotor;
	}
	public void setModeloMotor(String modeloMotor) {
		this.modeloMotor = modeloMotor;
	}
	public int getQuilometragemMotor() {
		return quilometragemMotor;
	}
	public void setQuilometragemMotor(int quilometragemMotor) {
		this.quilometragemMotor = quilometragemMotor;
	}
	public int getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}
	public void setQuilometrosPorLitro(int quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
}
