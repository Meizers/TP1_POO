package ar.edu.unlu.poo.tareav3;
import java.util.Comparator;

public class Comparador_prioridad implements Comparator<Tarea>{
    @Override
    public int compare(Tarea tarea1, Tarea tarea2){
        return Integer.compare(tarea1.get_prioridad(),tarea2.get_prioridad());
    }
}
