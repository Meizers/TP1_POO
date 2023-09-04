import java.util.Scanner;
import ar.edu.unlu.poo.pilas.Pila;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();
        while (true) {
            System.out.println("=== Menu Pila  ===");
            System.out.println("1. Consultar si la Pila está vacía");
            System.out.println("2. Apilar dato");
            System.out.println("3. Desapila dato");
            System.out.println("4. Recuperar el dato del tope de la Pila");
            System.out.println("5. Mostrar Pila");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    boolean estaVacia = pila.p_es_vacia();
                    if (estaVacia == true){
                        System.out.println("La Pila está vacía ");
                    } else {
                        System.out.println("La Pila No está vacía: ");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el dato a apilar: ");
                    Object dato_a_apilar = scanner.nextInt();
                    pila.p_apilar(dato_a_apilar);
                    System.out.println("Dato apilado");
                    break;
                case 3:
                    if (pila.p_es_vacia()){
                        System.out.println("La Pila está vacía ");
                    } else {
                        Object dato_desapilado = pila.p_desapilar();
                        System.out.print("el dato "+ dato_desapilado + " fue desapilado correctamente \n");
                    }
                    break;
                case 4:
                    if (pila.p_es_vacia()){
                        System.out.println("La Pila está vacía ");
                    } else {
                        Object dato_recuperado = pila.p_recuperar();
                        System.out.println("El dato actual en el tope de la pila es " + dato_recuperado);
                    }
                    break;
                case 5:
                    pila.p_mostrar();
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