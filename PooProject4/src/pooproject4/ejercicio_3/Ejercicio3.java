/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Clase Números Aleatorios.
 *
 * se realizan las instancias utilizadas según el caso.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class Ejercicio3 extends NumerosAleatorios {

    /**
     * Metodo para crear números Aleatorios
     */
    public static void crearAleatorio() {

        Scanner sc = new Scanner(System.in);

        /**
         * Se utiliza la función random de la clase Math esta funcion nos
         * devuelve un numero aleatorio en este caso esta generado entre 1 y 10
         * lo multiplicamos por 10 para tener un numero entre 0 y 10 le sumamos
         * 1 para tener un numero de 1 a 10. lo ordenamos con la funcion
         * Collections.sort(numeros);
         */
        int numero;
        ArrayList numeros = new ArrayList();

        /**
         * Crear la lista de números de 1 a 10
         */
        for (int i = 1; i <= 10; i++) {
            numero = (int) (Math.random() * 10 + 1);
            try {

                if (numeros.contains(numero)) {
                    i--;
                } else {
                    numeros.add(numero);
                }
            } catch (Exception e) {
            }

        }
        System.out.println("Numeros Aleatorios: ");
        for (Object n : numeros) {
            System.out.println(n + "");

        }

        System.out.print("Digite. \n1 para ordenar ascendente! "
                + "\n2 para descendente "
                + "\nIngrese el numero : ");
        int nu = Integer.parseInt(sc.nextLine());

        /**
         * Métodos para recorrer de forma ascendente o descendente según lo
         * quiera el usuario.
         */
        try {

            if (nu == 1) {

                Collections.sort(numeros);
                System.out.println("Numeros Aleatorios ordenados Ascendente: ");
                for (Object n : numeros) {
                    System.out.println(n + "");
                }
            } else if (nu == 2) {

                Collections.sort(numeros, Collections.reverseOrder());
                System.out.println("Numeros Aleatorios ordenados Descendente: ");
                for (Object n : numeros) {
                    System.out.println(n + "");
                }
            } else {
                System.out.println("Número no valido!");
            }
        } catch (Exception e) {

        }
    }
}
