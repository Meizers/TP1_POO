package ar.edu.unlu.poo.libros;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Biblioteca {
    private int Cantidad_total_de_prestamos = 0;
    private ArrayList<Libro> libros = new ArrayList<>();

    public void Set_Libro(Libro libro){
        libros.add(libro);
    }

    public Libro Get_Libro(String titulo){
        for (Libro libro : libros) {
            if (libro.Get_titulo().equals(titulo)){
                return libro;
            }
        }
        System.out.println("No se encuentra ningun libro con ese titulo en la biblioteca");
        return null;
    }

    public void Prestar_libro(String titulo, int cant){
        for (Libro libro : libros) {
            if (libro.Get_titulo().equals(titulo)){
                libro.prestar_ejemplares(cant);
                return;
            }
        }
    }

    public void Total_prestados(){
        Libro libro = libros.get(0);
        System.out.println("El total de libros prestados es " + libro.Get_total_prestador());
        return;
    }


}
