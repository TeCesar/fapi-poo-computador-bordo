package br.edu.fapi.TanqueDeGasolina;

public class TanqueDeGasolina {
	private float capacidadeTanque;
	private float litrosAtual;
        private int autonomiaTanque;
        private int contadorAutonomia = 0;

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getLitrosAtual() {
        return litrosAtual;
    }

    public void setLitrosAtual(float litrosAtual) {
        this.litrosAtual = litrosAtual;
    }

    public int getAutonomiaTanque() {
        return autonomiaTanque;
    }

    public void setAutonomiaTanque(int autonomiaTanque) {
        this.autonomiaTanque = autonomiaTanque;
    }

    public int getContadorAutonomia() {
        return contadorAutonomia;
    }

    public void setContadorAutonomia(int contadorAutonomia) {
        this.contadorAutonomia = contadorAutonomia;
    }
	
	

}
