import java.util.Scanner;


public class NewBanc {
    private Scanner teclado;
    private NewClient cliente1;
    private NewClient cliente2;
    private NewClient cliente3;
    private int saldoBanco;

    public NewBanc() {
        teclado = new Scanner(System.in);
        cliente1 = new NewClient("pedro");
        cliente2 = new NewClient("iris");
        cliente3 = new NewClient("amparo");
    }

    public void realizarOperaciones() {
        String nombre;
        String extraer = "extraer";
        String depositar = "depositar";
        String queRealizar;

        int finalizar = 1;
        while (finalizar != 0) {
            int cantidad = 0;
            System.out.println("Introduce el nombre del cliente");
            nombre = teclado.next();
            if (nombre.equals(cliente1.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente1.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente1.extraerMonto(cantidad);
                }

            } else if (nombre.equals(cliente2.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente2.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente2.extraerMonto(cantidad);
                }

            } else if (nombre.equals(cliente3.toString())) {
                System.out.println("Introduce la operacion a realizar, depositar o extraer");
                queRealizar = teclado.next();
                if (queRealizar.equals(depositar)) {
                    System.out.println("Introduce la cantidad a depositar: ");
                    cantidad = teclado.nextInt();
                    cliente3.depositarMonto(cantidad);
                }
                if (queRealizar.equals(extraer)) {
                    System.out.println("Introduce la cantidad a extraer: ");
                    cantidad = teclado.nextInt();
                    cliente3.extraerMonto(cantidad);
                }

            }
            System.out.println("Deseas realizar otra operacion pulsa 1 si no pulsa 0.");
            finalizar = teclado.nextInt();
        }
    }

    public void imprimirClienteYSaldo() {
        System.out.println("El nombre del cliente es: " + cliente1.toString());
        System.out.println("y su saldo es de:         " + cliente1.retornarMonto());
        System.out.println("El nombre del cliente es: " + cliente2.toString());
        System.out.println("y su saldo es de:         " + cliente2.retornarMonto());
        System.out.println("El nombre del cliente es: " + cliente3.toString());
        System.out.println("y su saldo es de:         " + cliente3.retornarMonto());
    }

    public void imprimirSaldoTotalBanco() {
        saldoBanco = (cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto());
        System.out.println("El saldo total del banco es de: " + saldoBanco);
    }

    public static void main(String[] args) {
        NewBanc otroBanco = new NewBanc();
        otroBanco.realizarOperaciones();
        otroBanco.imprimirClienteYSaldo();
        otroBanco.imprimirSaldoTotalBanco();
    }
}

/**
 * System.out.println();
 * 28
 * Problema 1: *
 * Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco requiere que al final del día
 * calcule la cantidad de dinero que hay depositada. *
 * Lo primero que hacemos es identificar las clases: *
 * Podemos identificar la clase Cliente y la clase Banco. *
 * Luego debemos definir los atributos y los métodos de cada clase:
 * Banco
 * atributos
 * 3 Cliente (3 objetos de la clase Cliente)
 * 1 Scanner (Para poder hacer la entrada de datos por teclado)
 * métodos
 * constructor
 * operar
 * depositosTotales
 * <p>
 * Cliente
 * atributos
 * nombre
 * monto
 * métodos
 * constructor
 * depositar
 * extraer
 * retornarMonto
 **/