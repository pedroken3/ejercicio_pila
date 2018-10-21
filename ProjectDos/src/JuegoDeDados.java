import java.util.Scanner;

public class JuegoDeDados {

    private Scanner teclado = new Scanner(System.in);
    private Dados dado1, dado2, dado3;
    private int dadoUno, dadoDos, dadoTres;


    public JuegoDeDados() {
        dado1 = new Dados();
        dado2 = new Dados();
        dado3 = new Dados();
    }

    public void jugar(){
        int finalizar = 1;
        while (finalizar != 0) {

            dadoUno = dado1.retornarValor();
            dadoDos = dado2.retornarValor();
            dadoTres = dado3.retornarValor();
            comparar();
            System.out.println("Si quieres seguir jugando pulsa 1, si quieres parar pulsa 0");
            finalizar = teclado.nextInt();
        }
    }

    public void comparar() {
        if (dadoUno == dadoDos && dadoUno == dadoTres) {
            System.out.println("PREMIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
            System.out.println("lOS TRES NUMEROS SON IGUALES");
            System.out.println(dadoUno +" "+ dadoDos + " " + dadoTres);
        } else {
            System.out.println(dadoUno +" "+ dadoDos + " " + dadoTres);
            System.out.println("Fallastes intentalo otra vez si te apetece");

        }
    }

    public static void main(String[] args) {
        JuegoDeDados jugar = new JuegoDeDados();
        jugar.jugar();
    }
}

//System.out.println();
/**
 * Problema 2:
 * <p>
 * Plantear un programa que permita jugar a los dados. Las reglas de juego son: se tiran tres dados si los
 * tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió". *
 * Lo primero que hacemos es identificar las clases: *
 * Podemos identificar la clase Dado y la clase JuegoDeDados. *
 * Luego los atributos y los métodos de cada clase: *
 * JuegoDeDados:
 * atributos
 * 3 Dado (3 objetos de la clase Dado)
 * métodos
 * constructor
 * jugar
 * <p>
 * Dado:
 * atributos
 * valor
 * métodos
 * tirar
 * imprimir
 * retornarValor
 **/