package factorias;
import partes.Arquero;
import partes.arqueroMasculino;
import partes.Atacante;
import partes.AtacanteHombre;
import partes.Defensor;
import partes.DefensorHombre;

public class EquipoMasculino extends Equipofactory {
public Arquero crearArquero(){
    return new arqueroMasculino();

}
    public Defensor crearDefensor(){
        return new DefensorHombre();
    }
    public Atacante crearAtacante(){
        return new AtacanteHombre();
    }
}
