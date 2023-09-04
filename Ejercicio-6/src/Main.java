import ar.edu.unlu.poo.libros.Libro;
import ar.edu.unlu.poo.libros.Biblioteca;



public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El arte de la guerra", "Sun Tzu", 152, 10);
        Libro libro2 = new Libro("Breve historia del tiempo", "Stephen Hawking", 216, 1);

        libro1.Mostrar_libro();
        libro2.Mostrar_libro();

        if (libro1.Get_num_paginas() > libro2.Get_num_paginas()){
            System.out.println("El libro " + libro1.Get_titulo() + " Tiene mas paginas que el libro " + libro2.Get_titulo());
        } else if (libro1.Get_num_paginas() < libro2.Get_num_paginas()){
            System.out.println("El libro " + libro2.Get_titulo() + " Tiene mas paginas que el libro " + libro1.Get_titulo());
        } else {
            System.out.println("El libro " + libro1.Get_titulo() + " y el libro" + libro2.Get_titulo() + " tiene la misma cantidad de paginas");
        }

        // creo una biblioteca para guardar los libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.Set_Libro(libro1);
        biblioteca.Set_Libro(libro2);

        biblioteca.Prestar_libro(libro1.Get_titulo(),5);
        biblioteca.Prestar_libro(libro2.Get_titulo(),3);

        biblioteca.Total_prestados();
    }
}