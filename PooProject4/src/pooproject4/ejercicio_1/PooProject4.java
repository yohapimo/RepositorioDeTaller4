/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_1;

import java.util.Scanner;

/**
 * Clase Main.
 *
 * se realizan las instancias utilizadas según el caso.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class PooProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Crear ingreso por consola de planetas, creando lista para que el
         * usuario escoja el número correspondiente al planeta el cual desea
         * saber los datos.
         */
        System.out.println("EJERCICIO 1.\nCalcularemos la atracción gravitatoria de un Planeta respecto al sol!!");
        System.out.println("Escoge el número según el Planeta. "
                + "\n1: Mercurio"
                + "\n2: Venus"
                + "\n3: Tierra"
                + "\n4: Marte"
                + "\n5: Jupiter"
                + "\n6: Saturno"
                + "\n7: Urano"
                + "\n8: Neptuno");

        try {

            System.out.print("\nDigita aqui el número: ");
            int numero = Integer.parseInt(sc.nextLine());

            if (numero == 1) {
                Mercury objMercury = new Mercury(1, "Mercurio", 3.30E23, 5.42, 2439.7, 5.79E10, 6.67E-11);
                objMercury.CreateMercury();

            } else if (numero == 2) {

                Venus objVenus = new Venus(2, "Venus", 4.869E24, 5.25, 6051.8, 1.08E11, 6.67E-11);
                objVenus.CreateVenus();

            } else if (numero == 3) {

                Earth objEarth = new Earth(3, "Earth", 5.98E24, 5.515, 6378.14, 1.49E11, 6.67E-11);
                objEarth.CreateEarth();

            } else if (numero == 4) {

                Mars objMars = new Mars(4, "Mars", 6.42E23, 3.94, 3397.2, 2.28E11, 6.67E-11);
                objMars.CreateMars();

            } else if (numero == 5) {

                Jupiter objJupiter = new Jupiter(5, "Jupiter", 1.9E27, 1.33, 71942, 7.78E11, 6.67E-11);
                objJupiter.CreateJupiter();

            } else if (numero == 6) {

                Saturn objSaturn = new Saturn(6, "Saturn", 5.69E26, 0.69, 60268, 1.42E12, 6.67E-11);
                objSaturn.CreateSaturn();

            } else if (numero == 7) {

                Uranium objUranium = new Uranium(7, "Uranium", 8.69E25, 1.29, 25559, 2.87E12, 6.67E-11);
                objUranium.CreateUranium();

            } else if (numero == 8) {

                Neptune objNeptune = new Neptune(8, "Neptune", 1.03E26, 1.64, 24746, 4.50E12, 6.67E-11);
                objNeptune.CreateNeptune();

            } else {
                System.out.println("Número no valido!");
            }
        } catch (Exception e) {
        }

    }
}
