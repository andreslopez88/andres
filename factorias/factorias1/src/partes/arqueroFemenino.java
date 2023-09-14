package partes;

public class arqueroFemenino implements Arquero {
 @Override
    public String saqueArco() {
       
        return "sacar arquero mujer";
    }

   
    public String tirarDerecha() { 
        return "tirarse derecha arquero mujer";
    }

       @Override
    public String tirarzeIzquieda() {
        
        return "tirarse izquerda arquero mujer";
    }


    @Override
    public String toString() {
        return "arqueroFemenino []";
    }

    
}
