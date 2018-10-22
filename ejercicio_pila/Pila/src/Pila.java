import java.util.Scanner;

public class Pila {
    private Scanner teclado;
    private int valor;
    private int informacion;
    private int siguiente;
    private int puntero;
    private Pila pila;

    public Pila() {
        teclado = new Scanner(System.in);
        //pila = new Pila();
    }

    public void queHacer() {
        int introducirNumero = 1;
        int sacarNumero = 2;
        int print = 3;
        int finalizar = -1;
        while (finalizar != 0) {
            System.out.println("si quieres introducir un numero pulsa 1, extraer pulsa 2, imprir pulsa 3, salir del programa mulsa 0");
            finalizar = teclado.nextInt();
            if (finalizar == 1) {
                insertar();
            }
            if (finalizar == 2) {
                extraer();
            }
            if (finalizar == 3) {
                imprimirPila();
            }
        }
    }

    public void insertar() {
        System.out.println("Introduce el valor a añadir a la pila:");
        valor = teclado.nextInt();
        //puntero = valor;
        //valor = siguiente;
    }

    public void extraer() {

    }

    public void imprimirPila() {
        System.out.println(valor);
    }



}

/**
 * Problema 1:
 * <p>
 * Confeccionar una clase que administre una lista tipo pila (se debe poder:
 * insertar,
 * extraer
 * imprimir
 * los datos de la pila)
 **/