package br.edu.fapi.roda;

public class FabricaDeRoda {

   
   public Roda fabricaRoda (int tamanhoRoda){
       Roda roda = new Roda();
       
       roda.setTamanhoRoda(tamanhoRoda);
       
       return roda;
   }
}
