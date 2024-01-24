package main;

import model.Lada;

public class LogikaiProgram {

    public static void main(String[] args) {
        feladat();
        
    }

    public static void feladat() {
        
      Lada[] ladak = new Lada [] {new Lada("Arany", "én rejtem"),
                                 new Lada("Ezüst", "nem én rejtem"),
                                 new Lada("Arany", "Az arany hazudik", true),};
      
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag();
            String felirat = lada.getFelirat();
            boolean kincs = lada.isKincs();
        }
    }
    
}
