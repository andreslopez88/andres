package partes;

public class arqueroMasculino implements Arquero {

    @Override
    public String tirarzeIzquieda() {
      
        return "tirarse izquierda arquero hombre";
    }

    @Override
    public String saqueArco() {
       
        return"sacar arquero hombre";
    }

    @Override
    public String tirarDerecha() {
    
        return "tirarse derecha arquero hombre";
    }

    @Override
    public String toString() {
        return "arqueroMasculino []";
    }

    
}
