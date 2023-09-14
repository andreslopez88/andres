import factorias.EquipoFemenino;
import factorias.EquipoMasculino;
import factorias.Equipofactory;
import partes.Arquero;
import partes.Atacante;
import partes.Defensor;

public class App{
  public static void main(String[] args) throws Exception{
    crearEquipo(new EquipoMasculino());
    crearEquipo(new EquipoFemenino());
   }
   public static void crearEquipo(Equipofactory factorias){
    Arquero arquero = factorias.crearArquero();
    Defensor defensor = factorias.crearDefensor();
    Atacante atacante = factorias.crearAtacante();

    System.out.println("____un equipo fue creado_____");
    System.out.println(arquero.saqueArco());   
    System.out.println(defensor.barrida());
    System.out.println(atacante.cabezazo0fensivo());
}

}

    

