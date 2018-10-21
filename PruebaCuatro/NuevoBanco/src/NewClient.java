

public class NewClient {

    private String nombre;
    private int monto;

    public NewClient(String nombreCliente) {
        nombre = nombreCliente;
        monto = 0;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void depositarMonto(int depositar) {
        monto = monto + depositar;
    }

    public void extraerMonto(int extraer) {
        monto = monto - extraer;
    }

    public int retornarMonto() {
        return monto;
    }

}

/**
 * 28
 * Problema 1:

 Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco requiere que al final del día
 calcule la cantidad de dinero que hay depositada.

 Lo primero que hacemos es identificar las clases:

 Podemos identificar la clase Cliente y la clase Banco.

 Luego debemos definir los atributos y los métodos de cada clase:

 Cliente
 atributos
 nombre
 monto
 métodos
 constructor
 depositar
 extraer
 retornarMonto

 Banco
 atributos
 3 Cliente (3 objetos de la clase Cliente)
 1 Scanner (Para poder hacer la entrada de datos por teclado)
 métodos
 constructor
 operar
 depositosTotales
 **/
