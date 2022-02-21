/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Clase Main.
 *
 * Ejecicio donde aplicacamos el Main.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class MetodosMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Aqui tenemos un ejemplo de un segundo main en el mismo proyecto,
         * aunque no es una buena pratica lo podemos hacer, para ejecutarlo
         * damos dar click derecho sobre el proyecto que queramos ejecutar.
         */
        System.out.print("Ingrese un numero: ");
        Double numero = Double.parseDouble(sc.nextLine());   // Con esta forma puedo ingresar decimales con punto

        /**
         * Libreria para hallar la raiz
         */
        Double raiz = Math.sqrt(numero);

        /**
         * Resultado sin decimales
         */
        System.out.println("La raiz es: " + raiz);

        /**
         * Se importa libreria, 2 decimales
         */
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raiz es: : " + df.format(raiz) + " Resultado con 2 decimales");

    }
}
