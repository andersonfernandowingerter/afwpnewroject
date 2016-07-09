9package prova;

import java.util.ArrayList;

public class ExeProva1 {
    public static void main(String[] args) {
        // TODO code application logic here
	// Testando commit
         ArrayList<Comida> Cesta = new ArrayList<Comida>();
         Bebida refri = new Bebida("refri",6500.0,"validade");
         Fruta maca = new Fruta("maça",10,5500);
         Cesta.add(maca);
         Cesta.add(refri);
            
        for(Comida obj : Cesta){
           System.out.println(obj);
        }
        
    }
    
}
