package br.edu.fapi.pneu;

public class FabricaDePneu {

	
	public Pneu fabricaPneu (String modeloPneu, String marcaPneu, int tamanhoPneu, int quilometragemPneu, int durabilidadePneu) {
            Pneu pneu = new Pneu();
		
            pneu.setModeloPneu(modeloPneu);
            pneu.setMarcaPneu(marcaPneu);
            pneu.setTamanhoPneu(tamanhoPneu);
            pneu.setQuilometragemPneu(quilometragemPneu);
            pneu.setDurabilidadePneu(durabilidadePneu);
            pneu.setStep(false);
            return pneu;		
	}
        
        public Pneu fabricaPneuStep (String modeloPneu, String marcaPneu, int tamanhoPneu, int quilometragemPneu, int durabilidadePneu){
            Pneu pneu = new Pneu();
            
            pneu.setModeloPneu(modeloPneu);
            pneu.setMarcaPneu(marcaPneu);
            pneu.setTamanhoPneu(tamanhoPneu);
            pneu.setQuilometragemPneu(quilometragemPneu);
            pneu.setDurabilidadePneu(durabilidadePneu);
            pneu.setStep(true);
            
            return pneu;
        }
}
