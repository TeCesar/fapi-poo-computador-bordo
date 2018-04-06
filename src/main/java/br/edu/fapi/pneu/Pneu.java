package br.edu.fapi.pneu;

public class Pneu {
	private String modeloPneu;
	private String marcaPneu;
	private int tamanhoPneu;
	private int quilometragemPneu;
        private int durabilidadePneu;
	private boolean step;
	
	public boolean isStep() {
		return step;
	}
	public void setStep(boolean step) {
		this.step = step;
	}
	public String getModeloPneu() {
		return modeloPneu;
	}
	public void setModeloPneu(String modeloPneu) {
		this.modeloPneu = modeloPneu;
	}
	public String getMarcaPneu() {
		return marcaPneu;
	}
	public void setMarcaPneu(String marcaPneu) {
		this.marcaPneu = marcaPneu;
	}
	public int getTamanhoPneu() {
		return tamanhoPneu;
	}
	public void setTamanhoPneu(int tamanhoPneu) {
		this.tamanhoPneu = tamanhoPneu;
	}
	public int getQuilometragemPneu() {
		return quilometragemPneu;
	}
	public void setQuilometragemPneu(int quilometragemPneu) {
		this.quilometragemPneu = quilometragemPneu;
	}

        public int getDurabilidadePneu() {
            return durabilidadePneu;
        }

        public void setDurabilidadePneu(int durabilidadePneu) {
            this.durabilidadePneu = durabilidadePneu;
        }

}
