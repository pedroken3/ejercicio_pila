public class Dados {

    private int valorDado;

    public void generarTirada() {
        valorDado = 1 + (int)Math.floor(Math.random()*(1) * 6);
    }



    public int retornarValor() {
        generarTirada();
        return valorDado;
    }


}
//System.out.println();
/**

 * Problema 2:

 Plantear un programa que permita jugar a los dados. Las reglas de juego son: se tiran tres dados si los
 tres salen con el mismo valor mostrar un mensaje que "gano", sino "perdió".

 Lo primero que hacemos es identificar las clases:

 Podemos identificar la clase Dado y la clase JuegoDeDados.

 Luego los atributos y los métodos de cada clase:

 Dado
 atributos
 valor
 métodos
 tirar
 imprimir
 retornarValor

 JuegoDeDados
 atributos
 3 Dado (3 objetos de la clase Dado)
 métodos
 constructor
 jugar
 **/