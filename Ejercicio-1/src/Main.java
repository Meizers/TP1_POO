import java.util.Scanner;
import ar.edu.unlu.poo.lista.Lista;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        while (true) {
            System.out.println("=== Menu Lista-Enlazada===");
            System.out.println("1. Consultar si la lista está vacía");
            System.out.println("2. Cantidad de elementos en la lista");
            System.out.println("3. Agregar elemento en la lista");
            System.out.println("4. Eliminar elemento de la lista");
            System.out.println("5. Recuperar elemento de la lista");
            System.out.println("6. Insertar elemento en la lista");
            System.out.println("7. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    boolean estaVacia = lista.l_es_vacia();
                    System.out.println("La lista está vacía: " + estaVacia);
                    break;
                case 2:
                    int longitud = lista.l_longitud();
                    System.out.println("Longitud de la lista: " + longitud);
                    break;
                case 3:
                    System.out.print("Ingrese el elemento a agregar: ");
                    Object elementoAgregar = scanner.nextInt();
                    lista.l_agregar(elementoAgregar);
                    break;
                case 4:
                    System.out.print("Ingrese el elemento a eliminar: ");
                    Object elemento = scanner.nextInt();
                    lista.l_borrar(elemento);
                    break;
                case 5:
                    System.out.print("Ingrese la posición del elemento a recuperar: ");
                    int posic = scanner.nextInt();
                    if (posic > 0 && posic <= lista.l_longitud()) {
                        Object elementoRec = lista.l_recuperar(posic);
                        System.out.println("Elemento en la posición " + posic + ": " + elementoRec);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese la posición donde desea insertar el elemento: ");
                    int posicion = scanner.nextInt();
                    System.out.print("Ingrese el elemento a insertar: ");
                    Object elementoInsertar = scanner.nextInt();
                    if (posicion > 0 && posicion <= lista.l_longitud()) {
                        lista.l_insertar(elementoInsertar, posicion);
                        System.out.println("Elemento insertado en la posición " + posicion + ".");
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 7:
                    lista.l_mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }
    }
}
