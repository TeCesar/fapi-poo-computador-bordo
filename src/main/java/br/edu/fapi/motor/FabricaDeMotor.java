package br.edu.fapi.motor;

public class FabricaDeMotor {

	
	public Motor fabricaMotor (String modeloMotor, int quilometragemMotor) {
		Motor motor = new Motor();
		
		motor.setModeloMotor(modeloMotor);
		motor.setQuilometragemMotor(quilometragemMotor);
		
		return motor;
	}
}
