package br.edu.fapi.carro;

import br.edu.fapi.TanqueDeGasolina.TanqueDeGasolina;
import br.edu.fapi.acessorios.Bluetooth;
import br.edu.fapi.acessorios.TetoSolar;
import br.edu.fapi.banco.Banco;
import br.edu.fapi.motor.Motor;
import br.edu.fapi.pneu.Pneu;
import br.edu.fapi.roda.Roda;

public class Carro {
        
	private Banco bancoMotorista;
	private Banco bancoPassageiro;
	private Banco bancoTraseiro;
	private Pneu pneuDianteiroEsquerdo;
	private Pneu pneuDianteiroDireito;
	private Pneu pneuTraseiroEsquerdo;
	private Pneu pneuTraseiroDireito;
	private Pneu pneuStep;
        private Roda rodaDianteiraEsquerda;
        private Roda rodaDianteiraDireita;
        private Roda rodaTraseiraEsquerda;
        private Roda rodaTraseiraDireita;
        private Roda rodaStep;
	private Motor motor;	
	private Bluetooth bluetooth;
        private TetoSolar tetoSolar;
        private TanqueDeGasolina tanqueDeGasolina;

   
    
    
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Pneu getPneuDianteiroEsquerdo() {
		return pneuDianteiroEsquerdo;
	}

	public void setPneuDianteiroEsquerdo(Pneu pneuDianteiroEsquerdo) {
		this.pneuDianteiroEsquerdo = pneuDianteiroEsquerdo;
	}

	public Pneu getPneuDianteiroDireito() {
		return pneuDianteiroDireito;
	}

	public void setPneuDianteiroDireito(Pneu pneuDianteiroDireito) {
		this.pneuDianteiroDireito = pneuDianteiroDireito;
	}

	public Pneu getPneuTraseiroEsquerdo() {
		return pneuTraseiroEsquerdo;
	}

	public void setPneuTraseiroEsquerdo(Pneu pneuTraseiroEsquerdo) {
		this.pneuTraseiroEsquerdo = pneuTraseiroEsquerdo;
	}

	public Pneu getPneuTraseiroDireito() {
		return pneuTraseiroDireito;
	}

	public void setPneuTraseiroDireito(Pneu pneuTraseiroDireito) {
		this.pneuTraseiroDireito = pneuTraseiroDireito;
	}

	public Banco getBancoPassageiro() {
		return bancoPassageiro;
	}

	public void setBancoPassageiro(Banco bancoPassageiro) {
		this.bancoPassageiro = bancoPassageiro;
	}

	public Banco getBancoTraseiroDireito() {
		return getBancoTraseiro();
	}

	public void setBancoTraseiroDireito(Banco bancoTraseiro) {
            this.setBancoTraseiro(bancoTraseiro);
        }

	public Banco getBancoMotorista() {
		return bancoMotorista;
	}

	public void setBancoMotorista(Banco bancoMotorista) {
		this.bancoMotorista = bancoMotorista;
	}

        public Banco getBancoTraseiro() {
            return bancoTraseiro;
        }

        public void setBancoTraseiro(Banco bancoTraseiro) {
            this.bancoTraseiro = bancoTraseiro;
        }

        public Pneu getPneuStep() {
            return pneuStep;
        }

    public void setPneuStep(Pneu pneuStep) {
        this.pneuStep = pneuStep;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public TanqueDeGasolina getTanqueDeGasolina() {
        return tanqueDeGasolina;
    }

    public void setTanqueDeGasolina(TanqueDeGasolina tanqueDeGasolina) {
        this.tanqueDeGasolina = tanqueDeGasolina;
    }

    public TetoSolar getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(TetoSolar tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public Roda getRodaDianteiraEsquerda() {
        return rodaDianteiraEsquerda;
    }

    public void setRodaDianteiraEsquerda(Roda rodaDianteiraEsquerda) {
        this.rodaDianteiraEsquerda = rodaDianteiraEsquerda;
    }

    public Roda getRodaDianteiraDireita() {
        return rodaDianteiraDireita;
    }

    public void setRodaDianteiraDireita(Roda rodaDianteiraDireita) {
        this.rodaDianteiraDireita = rodaDianteiraDireita;
    }

    public Roda getRodaTraseiraEsquerda() {
        return rodaTraseiraEsquerda;
    }

    public void setRodaTraseiraEsquerda(Roda rodaTraseiraEsquerda) {
        this.rodaTraseiraEsquerda = rodaTraseiraEsquerda;
    }

    public Roda getRodaTraseiraDireita() {
        return rodaTraseiraDireita;
    }

    public void setRodaTraseiraDireita(Roda rodaTraseiraDireita) {
        this.rodaTraseiraDireita = rodaTraseiraDireita;
    }

    public Roda getRodaStep() {
        return rodaStep;
    }

    public void setRodaStep(Roda rodaStep) {
        this.rodaStep = rodaStep;
    }

}
