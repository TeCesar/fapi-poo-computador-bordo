package br.edu.fapi.carro;

import java.util.Scanner;

import br.edu.fapi.TanqueDeGasolina.FabricaDeTanque;
import br.edu.fapi.acessorios.FabricaDeAcessorios;
import br.edu.fapi.banco.FabricaDeBanco;
import br.edu.fapi.motor.FabricaDeMotor;
import br.edu.fapi.pneu.FabricaDePneu;
import br.edu.fapi.roda.FabricaDeRoda;

public class FabricaDeCarro {

	public Carro fabricarCarro() {
		Carro carro = new Carro();
		Scanner scanner = new Scanner(System.in);
		
		constroiBancos(scanner, carro);
		constroiPneus(scanner, carro);
                constroiRodas (scanner, carro);
		constroiMotor(scanner, carro);
                constroiTanqueDeGasolina (scanner, carro);
		constroiBluetooth(scanner, carro);
                constroiTetoSolar(scanner, carro);
		return carro;
	}

	private void constroiBancos(Scanner scanner, Carro carro) {
		FabricaDeBanco fabricaDeBanco = new FabricaDeBanco();
		
		System.out.println("Digite o modelo do banco.");
		String modelo = scanner.nextLine();

		carro.setBancoMotorista(fabricaDeBanco.fabricaBanco(modelo));
		carro.setBancoPassageiro(fabricaDeBanco.fabricaBanco(modelo));
		carro.setBancoTraseiro(fabricaDeBanco.fabricaBanco(modelo));
		

	}
	
	private void constroiPneus (Scanner scanner, Carro carro) {
		FabricaDePneu fabricaDePneu = new FabricaDePneu();
		int quilometragemPneu;
                int durabilidadePneu;
                
		System.out.println("Digite o modelo do pneu.");
		String modeloPneu = scanner.nextLine();
		System.out.println("Digite a marca do pneu.");
		String marcaPneu = scanner.nextLine();
		System.out.println("Digite o tamanho do pneu.");
		int tamanhoPneu = scanner.nextInt();
                do {
                System.out.println("Digite a quilometragem do pneu.");
		
                quilometragemPneu = scanner.nextInt();
                
                if (quilometragemPneu <0){
                        System.out.println("Quilometragem invalida digite novamente.");                
                    }
                }while(quilometragemPneu < 0);
                
                do{
                System.out.println("Digite a durabilidade do pneu.");
                durabilidadePneu = scanner.nextInt();
                
                if (durabilidadePneu <=0){
                    System.out.println("Durabilidade invalida digite novamente.");
                }
		                
                }while(durabilidadePneu <= 0);
                int opcao;
                
                do {
                    System.out.println("O carro possui step?");
                    System.out.println("1- Sim");
                    System.out.println("2- Não");
                
                    opcao = scanner.nextInt();
                
                    switch (opcao) {
                    case 1:
                        carro.setPneuStep(fabricaDePneu.fabricaPneuStep(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));
                       break;
                    case 2:
                        carro.setPneuStep(fabricaDePneu.fabricaPneu(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));
                    break;
                    default:
                        System.out.println("Esta opção não é válida. Digite novamente.");
                        break;
                    }
                } while (opcao != 1 && opcao != 2);
		                
		carro.setPneuDianteiroEsquerdo(fabricaDePneu.fabricaPneu(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));
		carro.setPneuDianteiroDireito(fabricaDePneu.fabricaPneu(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));
		carro.setPneuTraseiroEsquerdo(fabricaDePneu.fabricaPneu(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));
		carro.setPneuTraseiroDireito(fabricaDePneu.fabricaPneu(modeloPneu, marcaPneu, tamanhoPneu, quilometragemPneu, durabilidadePneu));		
	}

	private void constroiMotor (Scanner scanner, Carro carro) {
		FabricaDeMotor fabricaDeMotor = new FabricaDeMotor();
		System.out.println("Digite o modelo do motor.");
		String modeloMotor = scanner.next();
		
		System.out.println("Digite a quilometragem do motor.");
		int quilometragemMotor = scanner.nextInt();
		
		carro.setMotor(fabricaDeMotor.fabricaMotor(modeloMotor, quilometragemMotor));
				
	}
        
        private void constroiTanqueDeGasolina (Scanner scanner, Carro carro){
                FabricaDeTanque fabricaDeTanque = new FabricaDeTanque();
                float litrosAtual;
                
                System.out.println("Digite a capacidade do seu tanque de gasolina");
                float capacidadeTanque = scanner.nextFloat();
                
                do{
                System.out.println("Digite a quantidade de litros existente no tanque");
                litrosAtual = scanner.nextFloat();
                } while (litrosAtual > capacidadeTanque);
                
                System.out.println("Digite a autonomia do tanque.");
                int autonomiaTanque = scanner.nextInt();
                
                carro.setTanqueDeGasolina(fabricaDeTanque.fabricaTanque(capacidadeTanque, litrosAtual, autonomiaTanque));
        }
        
        private void constroiBluetooth (Scanner scanner, Carro carro){
            FabricaDeAcessorios fabricaDeAcessorios = new FabricaDeAcessorios();
            
            int opcao;
            
            do{
                System.out.println("Seu carro possui bluetooth?");
                System.out.println("1- Sim.");
                System.out.println("2- Não.");
                opcao = scanner.nextInt();
            
                switch (opcao){
                    case 1:
                        carro.setBluetooth(fabricaDeAcessorios.fabricaBluetooth(opcao));
                        break;
                    case 2:
                        carro.setBluetooth(fabricaDeAcessorios.fabricaBluetooth(opcao));
                        break;
                    default:
                        System.out.println("Esta opção não é válida. Digite novamente");
                }
            } while (opcao != 1 && opcao != 2);
        }
        
        private void constroiTetoSolar (Scanner scanner, Carro carro){
            FabricaDeAcessorios fabricaDeAcessorios = new FabricaDeAcessorios();
            
            int opcao;
            
            do{
                System.out.println("Seu carro possui teto solar?");
                System.out.println("1- Sim.");
                System.out.println("2- Não.");
                opcao = scanner.nextInt();
            
                switch (opcao){
                    case 1:
                        carro.setTetoSolar(fabricaDeAcessorios.fabricaTetoSolar(opcao));
                        break;
                    case 2:
                        carro.setTetoSolar(fabricaDeAcessorios.fabricaTetoSolar(opcao));
                        break;
                    default:
                        System.out.println("Esta opção não é válida. Digite novamente");
                }
            } while (opcao != 1 && opcao != 2);
        }
        
        private void constroiRodas (Scanner scanner, Carro carro){
            FabricaDeRoda fabricaDeRoda = new FabricaDeRoda();
            System.out.println("Digite o tamanho da roda.");
            int tamanhoRoda = scanner.nextInt();
            
            carro.setRodaDianteiraDireita(fabricaDeRoda.fabricaRoda(tamanhoRoda));
            carro.setRodaDianteiraEsquerda(fabricaDeRoda.fabricaRoda(tamanhoRoda));
            carro.setRodaTraseiraDireita(fabricaDeRoda.fabricaRoda(tamanhoRoda));
            carro.setRodaTraseiraEsquerda(fabricaDeRoda.fabricaRoda(tamanhoRoda));
            carro.setRodaStep(fabricaDeRoda.fabricaRoda(tamanhoRoda));
        }

}

	
