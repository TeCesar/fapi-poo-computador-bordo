package br.edu.fapi.banco;

public class FabricaDeBanco {

    public Banco fabricaBanco (String modeloBanco){
        Banco banco = new Banco();
        
        banco.setModeloBanco(modeloBanco);
        
        return banco;
    }
}




