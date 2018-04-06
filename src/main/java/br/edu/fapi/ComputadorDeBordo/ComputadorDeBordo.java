package br.edu.fapi.ComputadorDeBordo;

import br.edu.fapi.carro.Carro;
import br.edu.fapi.carro.FabricaDeCarro;

public class ComputadorDeBordo {
    private FabricaDeCarro fabricaDeCarro = new FabricaDeCarro();
    private Carro carro = fabricaDeCarro.fabricarCarro();
    private VerificaPercurso verificaPercurso = new VerificaPercurso();

    
    public void verificarGasolina() {
        verificaPercurso.verificarGasolina();
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public FabricaDeCarro getFabricaDeCarro() {
        return fabricaDeCarro;
   }

    public void setFabricaDeCarro(FabricaDeCarro fabricaDeCarro) {
        this.fabricaDeCarro = fabricaDeCarro;
    }

    public VerificaPercurso getVerificaPercurso() {
        return verificaPercurso;
    }

    public void setVerificaPercurso(VerificaPercurso verificaPercurso) {
        this.verificaPercurso = verificaPercurso;
    }
    
    public void mostrarCarro (ComputadorDeBordo computadorDeBordo){
        System.out.println("");
        
        System.out.println("Tipo dos bancos: " + computadorDeBordo.getCarro().getBancoMotorista().getModeloBanco());
        
        System.out.println("Modelo dos pneus: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getModeloPneu());
        
        System.out.println("Marca dos pneus: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getMarcaPneu());
        
        System.out.println("Tamanho dos pneus: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getTamanhoPneu());
        
        System.out.println("Marca dos pneus: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getMarcaPneu());
        
        System.out.println("Quilometragem dos pneus: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getQuilometragemPneu());
        
        System.out.println("Possui step? " + computadorDeBordo.getCarro().getPneuStep().isStep());
        
        System.out.println("Tamanho das rodas: " + computadorDeBordo.getCarro().getRodaDianteiraEsquerda().getTamanhoRoda());
        
        System.out.println("Modelo do motor: " + computadorDeBordo.getCarro().getMotor().getModeloMotor());
        
        System.out.println("Quilometragem do motor: " + computadorDeBordo.getCarro().getMotor().getQuilometragemMotor());
        
        //System.out.println("Quilometros por litro que o motor faz: " + computadorDeBordo.getCarro().getMotor().getQuilometrosPorLitro());
        
        System.out.println("Capacidade do tanque: " + computadorDeBordo.getCarro().getTanqueDeGasolina().getCapacidadeTanque());
        
        System.out.println("Combustivel no tanque: " + computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual());
        
        System.out.println("Possui bluetooth? " + computadorDeBordo.getCarro().getBluetooth().isPossuiBluetooth());
        
        System.out.println("Possui teto solar? " + computadorDeBordo.getCarro().getTetoSolar().isPossuiTetoSolar());
    }
}
