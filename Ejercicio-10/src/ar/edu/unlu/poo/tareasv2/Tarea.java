package ar.edu.unlu.poo.tareasv2;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad; // considero la maxima prioridad como 5 y la minima como 1
    private boolean completada = false;
    private LocalDate fecha_limite;
    private LocalDate fecha_recordatorio;

    public void cambiar_descripcion(String nueva_descripcion) {
        descripcion = nueva_descripcion;
    }

    public void cambiar_prioridad(int nueva_prioridad) {
        if (nueva_prioridad < 1 || nueva_prioridad > 5){
            throw new IllegalArgumentException("Error, el numero de prioridad no entra en el rango valido");
        } else {
            prioridad = nueva_prioridad;
        }
    }

    public int get_prioridad(){
        return prioridad;
    }

    public void definir_fecha(LocalDate fecha){
        fecha_limite = fecha;
    }

    public void definir_recordatorio(LocalDate fecha_recordatorio){
        if (LocalDate.now().isAfter(fecha_recordatorio) || LocalDate.now().equals(fecha_recordatorio)){
            prioridad = 5;
        }
        this.fecha_recordatorio = fecha_recordatorio;
    }

    public void terminada() {
        completada = true;
    }

    public boolean vencida() {
        return !completada && LocalDate.now().isAfter(fecha_limite);
    }

    public boolean completa() {
        return completada;
    }

    public boolean recordatorio(){
        return !completada && ( LocalDate.now().isBefore(fecha_recordatorio) || LocalDate.now().equals(fecha_recordatorio) );
    }



    public void mostrar() {
        if (vencida()) {
            System.out.println("(Vencida)..." + descripcion);
        } else if (recordatorio()){
            System.out.println("(por vencer)..." + descripcion);
        } else {
            System.out.println(descripcion);
        }
    }
}
