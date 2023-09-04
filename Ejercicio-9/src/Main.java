import ar.edu.unlu.poo.fechas.Fecha;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        String fechaStr1 = "10-09-2023";
        String fechaStr2 = "15-09-2023";
        String fechaStr3 = "20-09-2023";

        Fecha gestor = new Fecha();
        LocalDate fecha1 = gestor.convertirFecha(fechaStr1, "dd-MM-yyyy");
        LocalDate fecha2 = gestor.convertirFecha(fechaStr2, "dd-MM-yyyy");
        LocalDate fecha3 = gestor.convertirFecha(fechaStr3, "dd-MM-yyyy");

        System.out.println("La Fecha 2 está entre Fecha 1 y Fecha 3? : " + gestor.fecha_esta_entre(fecha2, fecha1, fecha3));
        System.out.println("La Fecha 1 está entre Fecha 2 y Fecha 3? : " + gestor.fecha_esta_entre(fecha1, fecha2, fecha3));
        System.out.println("La Fecha 3 es mayor a la Fecha 1? : " + gestor.fecha_es_mayor(fecha3, fecha1));
        System.out.println("La Fecha 1 es mayor a la Fecha 2? : " + gestor.fecha_es_mayor(fecha1, fecha2));
        System.out.println("La Fecha 1 es menor que la Fecha 2? : " + gestor.fecha_es_menor(fecha1, fecha2));
        System.out.println("La Fecha 3 es menor que la Fecha 2? : " + gestor.fecha_es_menor(fecha3, fecha2));
    }
}