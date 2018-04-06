package br.edu.fapi.acessorios;

public class FabricaDeAcessorios {
	public Bluetooth fabricaBluetooth (int opcao) {
		Bluetooth bluetooth = new Bluetooth();
		
                if (opcao == 1){
                    bluetooth.setPossuiBluetooth(true);
                }else{
                    bluetooth.setPossuiBluetooth(false);
                }
		return bluetooth;		
	}
	public TetoSolar fabricaTetoSolar(int opcao) {
		TetoSolar tetoSolar = new TetoSolar();
		
		if (opcao == 1){
                    tetoSolar.setPossuiTetoSolar(true);
                }else{
                    tetoSolar.setPossuiTetoSolar(false);
                }
                
		return tetoSolar;		
	}
}
