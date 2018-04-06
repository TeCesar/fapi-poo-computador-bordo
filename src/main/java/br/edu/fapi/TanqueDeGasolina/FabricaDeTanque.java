package br.edu.fapi.TanqueDeGasolina;

public class FabricaDeTanque {
	public TanqueDeGasolina fabricaTanque (float capacidadeTanque, float litrosAtual, int autonomiaTanque) {
		TanqueDeGasolina tanqueDeGasolina = new TanqueDeGasolina();
		
		tanqueDeGasolina.setCapacidadeTanque(capacidadeTanque);
		tanqueDeGasolina.setLitrosAtual(litrosAtual);
                tanqueDeGasolina.setAutonomiaTanque(autonomiaTanque);
		
		return tanqueDeGasolina;
	}
}
