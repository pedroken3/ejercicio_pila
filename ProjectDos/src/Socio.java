public class Socio {
    private Club socio1, socio2, socio3;

    public Socio() {
        socio1 = new Club();
        socio2 = new Club();
        socio3 = new Club();
    }

    public void socioMasAntiguo() {
        if (socio1.getAntiguedad() > socio2.getAntiguedad() && socio1.getAntiguedad() > socio3.getAntiguedad()) {
            socio1.imprimirSocio();
        }else if (socio2.getAntiguedad() > socio3.getAntiguedad()) {
            socio2.imprimirSocio();
        } else {
            socio3.imprimirSocio();
        }
    }

    public static void main(String[] args) {
        Socio socioClub = new Socio();
        socioClub.socioMasAntiguo();
    }
}
/**
 * Plantear una clase Club y otra clase Socio.
 La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años).
 En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 objetos
 de la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club. **/