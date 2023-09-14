package factorias;
import partes.Arquero;
import partes.arqueroFemenino;
import partes.Atacante;
import partes.AtacanteMujer;
import partes.DefensorMujer;
import partes.Defensor;
public class EquipoFemenino extends Equipofactory {
    public Arquero creaArquero(){
        return new arqueroFemenino();

    }
public Atacante creAtacante(){
    return new AtacanteMujer();

}

public Defensor crearDefensor(){
    return new DefensorMujer(); 
}

}
