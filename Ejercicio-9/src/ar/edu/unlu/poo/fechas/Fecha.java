package ar.edu.unlu.poo.fechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {

    // Método para convertir una cadena en LocalDate con formato dd-MM-yyyy o MM-dd-yyyy
    public LocalDate convertirFecha(String fechaStr, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        return LocalDate.parse(fechaStr, formatter);
    }

    // Método para determinar si una fecha está entre otras dos fechas
    public boolean fecha_esta_entre(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return (fecha.isAfter(fechaInicio) || fecha.isEqual(fechaInicio))
                && (fecha.isBefore(fechaFin) || fecha.isEqual(fechaFin));
    }

    // Método para determinar si una fecha es mayor que otra fecha
    public boolean fecha_es_mayor(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    // Método para determinar si una fecha es menor que otra fecha
    public boolean fecha_es_menor(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isBefore(fecha2);
    }
}