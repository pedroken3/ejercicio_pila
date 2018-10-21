import java.util.Scanner;

public class Operacion {
    protected Scanner teclado;
    protected int valor1;
    protected int valor2;
    protected int resultado;

    public Operacion() {
        teclado = new Scanner(System.in);
    }

    public void cargar1() {
        System.out.println("Introduce el primer valor: ");
        valor1 = teclado.nextInt();
    }

    public void cargar2() {
        System.out.println("Introduce el segundo valor: ");
        valor2 = teclado.nextInt();
    }

    public void mostrarResultado() {
        System.out.println(resultado);
    }

}
/**Problema 1:////   29.

 Ahora plantearemos el primer problema utilizando herencia. Supongamos que necesitamos implementar dos clases que
 llamaremos Suma y Resta. Cada clase tiene como atributo valor1, valor2 y resultado. Los métodos a definir son cargar1
 (que inicializa el atributo valor1), carga2 (que inicializa el atributo valor2), operar (que en el caso de la
 clase "Suma" suma los dos atributos y en el caso de la clase "Resta" hace la diferencia entre valor1 y valor2, y
 otro método mostrarResultado.

 Si analizamos ambas clases encontramos que muchos atributos y métodos son idénticos. En estos casos es bueno definir
 una clase padre que agrupe dichos atributos y responsabilidades comunes.

 La relación de herencia que podemos disponer para este problema es:

 Operacion

 Suma                              Resta

 Solamente el método operar es distinto para las clases Suma y Resta (esto hace que no lo podamos disponer en la
 clase Operacion), luego los métodos cargar1, cargar2 y mostrarResultado son idénticos a las dos clases, esto hace
 que podamos disponerlos en la clase Operacion. Lo mismo los atributos valor1, valor2 y resultado se definirán en
 la clase padre Operacion.

 Crear un proyecto y luego crear cuatro clases llamadas: Operacion, Suma, Resta y Prueba**/