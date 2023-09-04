package ar.edu.unlu.poo.libros;

public class Libro {
    private String titulo;
    private String autor;
    private int num_paginas;
    private int ejemplares_disponibles;
    private int ejemplares_prestados = 0;
    static private int total_prestados;

    public Libro(String titulo,String autor,int num_paginas,int ejemplares_disponibles){
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
        this.ejemplares_disponibles = ejemplares_disponibles;
    }

    public void prestar_ejemplares(int cant){
        if (ejemplares_disponibles <= 1){
            System.out.println("No se puede prestar ejemplares ya que solo queda 1 copia del mismo");
        } else {
            while (ejemplares_disponibles > 1 && cant > 0){
                ejemplares_prestados++;
                total_prestados++;
                ejemplares_disponibles--;
                cant--;
            }
        }
    }

    public void recuperar_ejemplares(int cant){
        while (cant <= 0){
            if (ejemplares_prestados <= 0){
                ejemplares_prestados--;
            }
            ejemplares_disponibles++;
            cant--;
        }
    }

    public int Get_total_prestador(){
        return total_prestados;
    }

    public String Get_titulo(){
        return titulo;
    }

    public int Get_num_paginas(){
        return num_paginas;
    }


    public String Get_autor(){
        return autor;
    }

    public int Get_ejemplares(){
        return ejemplares_disponibles;
    }

    public int Get_prestados(){
        return ejemplares_prestados;
    }

    public void Mostrar_libro(){
        System.out.println("El libro " + titulo + " creado por el autor " + autor + " tiene " + num_paginas + " Paginas, quedan " + ejemplares_disponibles + " ejemplares disponibles y se prestaron " + ejemplares_prestados);
    }

}
