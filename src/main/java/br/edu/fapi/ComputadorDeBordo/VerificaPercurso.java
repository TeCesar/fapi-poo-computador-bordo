package br.edu.fapi.ComputadorDeBordo;
//diminuiDurabilidadePneu**
public class VerificaPercurso {
    
    public float verificarGasolina (){
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        
        return computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual();
        
    }
    
    public void diminuiDurabilidadePneu (ComputadorDeBordo computadorDeBordo, int KM){
        int quilometragem;
        
    if(KM == 0){
        quilometragem = computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getDurabilidadePneu() - computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getQuilometragemPneu();
    }else{
        quilometragem = computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getDurabilidadePneu();
    }
               int quilometragemDiminuida = quilometragem - 1;
               
               computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().setDurabilidadePneu(quilometragemDiminuida);
               computadorDeBordo.getCarro().getPneuDianteiroDireito().setDurabilidadePneu(quilometragemDiminuida);
               computadorDeBordo.getCarro().getPneuTraseiroEsquerdo().setDurabilidadePneu(quilometragemDiminuida);
               computadorDeBordo.getCarro().getPneuTraseiroDireito().setDurabilidadePneu(quilometragemDiminuida);
    }
    
    public int verificarPneus (){
        ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        
        return computadorDeBordo.getCarro().getPneuDianteiroDireito().getQuilometragemPneu();
                
    }
    
    public boolean verificarTetoSolar (ComputadorDeBordo computadorDeBordo){
        return computadorDeBordo.getCarro().getTetoSolar().isPossuiTetoSolar();
    }
    
    public boolean verificarBluetooth (ComputadorDeBordo computadorDeBordo){
        return computadorDeBordo.getCarro().getBluetooth().isPossuiBluetooth();
    }
    
    public boolean verificarStep (ComputadorDeBordo computadorDeBordo){
        if (computadorDeBordo.getCarro().getPneuStep().isStep() == true){
            System.out.println("Seu pneu furou. Substituindo pelo step.");
            System.out.println("");
        }else{
            System.out.println("Que pena. seu pneu furou e você não tem step.");
            System.out.println("");
            
        }
        return computadorDeBordo.getCarro().getPneuStep().isStep();
    }
    
    public void diminuiDurabilidadePneu_Step (ComputadorDeBordo computadorDeBordo){
        int quilometragem;
        quilometragem = computadorDeBordo.getCarro().getPneuStep().getQuilometragemPneu();
    
    
               int quilometragemDiminuida = quilometragem - 1;
               
               computadorDeBordo.getCarro().getPneuStep().setDurabilidadePneu(quilometragemDiminuida);
    }
    
    public void diminuirGasolina (ComputadorDeBordo computadorDeBordo){
        computadorDeBordo.getCarro().getTanqueDeGasolina().setContadorAutonomia(computadorDeBordo.getCarro().getTanqueDeGasolina().getContadorAutonomia() + 1);
        if (computadorDeBordo.getCarro().getTanqueDeGasolina().getContadorAutonomia() == computadorDeBordo.getCarro().getTanqueDeGasolina().getAutonomiaTanque()){
            computadorDeBordo.getCarro().getTanqueDeGasolina().setLitrosAtual(computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual() - 1);
            computadorDeBordo.getCarro().getTanqueDeGasolina().setContadorAutonomia(0);
        }
    }
    
}
