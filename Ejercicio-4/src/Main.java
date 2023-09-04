import java.util.Scanner;
import ar.edu.unlu.poo.colas.Cola;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola cola = new Cola();
        while (true) {
            System.out.println("=== Menu Cola  ===");
            System.out.println("1. Consultar si la Cola está vacía");
            System.out.println("2. Encolar dato");
            System.out.println("3. Desencolar dato");
            System.out.println("4. Recuperar el dato del frente de la Cola");
            System.out.println("5. Mostrar Cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    boolean estaVacia = cola.c_es_vacia();
                    if (estaVacia){
                        System.out.println("La Cola está vacía ");
                    } else {
                        System.out.println("La Cola No está vacía: ");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el dato a encolar: ");
                    Object dato_a_encolar = scanner.nextInt();
                    cola.c_encolar(dato_a_encolar);
                    System.out.println("Dato encolado");
                    break;
                case 3:
                    if (cola.c_es_vacia()){
                        System.out.println("La Cola está vacía ");
                    } else {
                        Object dato_desencolado = cola.c_desencolar();
                        System.out.print("el dato "+ dato_desencolado + " fue desencolado correctamente \n");
                    }
                    break;
                case 4:
                    if (cola.c_es_vacia()){
                        System.out.println("La Cola está vacía ");
                    } else {
                        Object dato_recuperado = cola.c_recuperar();
                        System.out.println("El dato actual en el frente de la cola es " + dato_recuperado);
                    }
                    break;
                case 5:
                    cola.c_mostrar();
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