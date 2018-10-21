public class Prueba extends Operacion {

    public static void main(String[] args) {
        Suma realizarSuma = new Suma();
        realizarSuma.cargar1();
        realizarSuma.cargar2();
        System.out.println("El resultado de la suma es de : ");
        realizarSuma.suma();
        realizarSuma.mostrarResultado();
        Resta realizarResta = new Resta();
        realizarResta.cargar1();
        realizarResta.cargar2();
        System.out.println("El resultado de la resta es de : ");
        realizarResta.resta();
        realizarResta.mostrarResultado();
    }
}
