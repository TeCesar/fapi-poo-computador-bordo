package br.edu.fapi.ComputadorDeBordo;

public class Percurso {
        // recebe computadordebordo para fazer as verificaçoes 
    
    public void percorrerPercurso (ComputadorDeBordo computadorDeBordo) {
        int contDurabilidade = computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getDurabilidadePneu();
        float fixLitrosAtual = computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual();
        float autonomiaCombustivel;
        
        System.out.println("Você começou o trajeto.");
        for (int KM = 1; KM <= 500; KM++){
            autonomiaCombustivel = fixLitrosAtual - ((KM/fixLitrosAtual)*10);
            if (computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual() <= 0 || KM == contDurabilidade){
                if (computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual() <= 0){
                    System.out.println("Acabou sua gasolina. A viagem acabou.");
                    KM = 500;
                }else if (KM == contDurabilidade){
                    System.out.println("Seus pneus estouraram.");
                    KM = 500;
                }
                
            }
            
            if (computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual() > 0 && KM < contDurabilidade){
            computadorDeBordo.getVerificaPercurso().diminuirGasolina(computadorDeBordo);
            
            System.out.println("KM: " + KM);
            System.out.println("Litros no tanque: " + computadorDeBordo.getCarro().getTanqueDeGasolina().getLitrosAtual());
            System.out.println("KMs que podem ser percorridos com a gasolina atual: " +  autonomiaCombustivel);
            if (KM < 400){
                System.out.println("Durabilidade dos pneus. ");
                System.out.println("Dianteiro esquerdo: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getDurabilidadePneu() + "KM");
                System.out.println("Dianteiro direito: " + computadorDeBordo.getCarro().getPneuDianteiroDireito().getDurabilidadePneu() + "KM");
                System.out.println("Traseiro esquerdo: " + computadorDeBordo.getCarro().getPneuTraseiroEsquerdo().getDurabilidadePneu() + "KM");
                System.out.println("Traseiro direito: " + computadorDeBordo.getCarro().getPneuTraseiroDireito().getDurabilidadePneu() + "KM");
                System.out.println("");
                computadorDeBordo.getVerificaPercurso().diminuiDurabilidadePneu(computadorDeBordo, KM);
                
                if (KM == 220 && computadorDeBordo.getVerificaPercurso().verificarTetoSolar(computadorDeBordo) == true){
                    System.out.println("Você abriu o teto solar.");
                    System.out.println("");
                }
                if (KM == 240 && computadorDeBordo.getVerificaPercurso().verificarTetoSolar(computadorDeBordo) == true){
                    System.out.println("Você fechou o teto solar.");
                    System.out.println("");
                }
           
                if (KM == 350 && computadorDeBordo.getVerificaPercurso().verificarTetoSolar(computadorDeBordo) == true){
                    System.out.println("Você abriu o teto solar.");
                    System.out.println("");
                }
           
                if (KM == 390 && computadorDeBordo.getVerificaPercurso().verificarTetoSolar(computadorDeBordo) == true){
                    System.out.println("Você fechou o teto solar.");
                    System.out.println("");
                }
                
                if (KM == 370 && computadorDeBordo.getVerificaPercurso().verificarBluetooth(computadorDeBordo) == true){
                    System.out.println("Realizando chamada para o aparelho conectado ao bluetooth.");
                    System.out.println("");
                }else if (KM == 370 && computadorDeBordo.getVerificaPercurso().verificarBluetooth(computadorDeBordo) == false){
                    System.out.println("Você não possui Bluetooth para realizar ligações");
                }
            }else if (KM == 400){
                computadorDeBordo.getVerificaPercurso().verificarStep(computadorDeBordo);
            }else if (KM > 400 && computadorDeBordo.getVerificaPercurso().verificarStep(computadorDeBordo) == true){
                System.out.println("Durabilidade dos pneus. ");
                System.out.println("Dianteiro esquerdo: " + computadorDeBordo.getCarro().getPneuDianteiroEsquerdo().getDurabilidadePneu() + "KM");
                System.out.println("Dianteiro direito: " + computadorDeBordo.getCarro().getPneuDianteiroDireito().getDurabilidadePneu() + "KM");
                System.out.println("Traseiro esquerdo: " + computadorDeBordo.getCarro().getPneuTraseiroEsquerdo().getDurabilidadePneu() + "KM");
                System.out.println("Step: " + computadorDeBordo.getCarro().getPneuStep().getDurabilidadePneu() + "KM");
                System.out.println("");
                
                computadorDeBordo.getVerificaPercurso().diminuiDurabilidadePneu(computadorDeBordo, KM);
                computadorDeBordo.getVerificaPercurso().diminuiDurabilidadePneu_Step(computadorDeBordo);
            }else {
                KM = 500;
            }
        }
        }
    }
    }

