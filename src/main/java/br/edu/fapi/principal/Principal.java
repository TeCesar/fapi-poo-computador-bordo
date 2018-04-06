package br.edu.fapi.principal;

import br.edu.fapi.ComputadorDeBordo.ComputadorDeBordo;
import br.edu.fapi.ComputadorDeBordo.Percurso;

public class Principal {
    public static void main(String[] args) {
    	ComputadorDeBordo computadorDeBordo = new ComputadorDeBordo();
        Percurso percurso = new Percurso();
        
        percurso.percorrerPercurso(computadorDeBordo);
        
       
    }
}
