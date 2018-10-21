import java.util.Scanner;

public class Club {
    private Scanner teclado = new Scanner(System.in);
    private String nombre;
    private int antiguedad;

    public Club() {
        String nombreSocio;
        int tiempoEnElClub;
        System.out.println("Introduce el nombre del socio:");
        nombreSocio = teclado.next();
        System.out.println("Introduce la antiguedad del socio:");
        tiempoEnElClub = teclado.nextInt();
        nombre = nombreSocio;
        antiguedad = tiempoEnElClub;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void imprimirSocio() {
        System.out.println("El nombre del socio con mayor antiguedad es: " + nombre);
        System.out.println("con una antiguedad de: " + antiguedad);
    }

}
/**
 * Plantear una clase Club y otra clase Socio.
 La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años).
 En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 objetos
 de la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club. **/