/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_1;

/**
 * Clase Planet Mercurio.
 *
 * se realizan las instancias utilizadas según el caso.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class Mercury extends Planets {

    /**
     * Dato propio para esta clase.
     */
    double sunMass = 2.10E30;

    /**
     *
     * @param id
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param sun_distance
     * @param constG
     */
    public Mercury(int id, String name, double mass, double density, double diameter, double sun_distance, double constG) {
        super(id, name, mass, density, diameter, sun_distance, constG);
    }

    public double getSunMass() {
        return sunMass;
    }

    public void setSunMass(double sunMass) {
        this.sunMass = sunMass;
    }

    public void CreateMercury() {

        /**
         * Formula atracción gravitatoria.
         */
        double respuesta = (constG * mass * getSunMass()) / (sun_distance * sun_distance);

        /**
         * Crear lista datos del respectivo planeta.
         */
        System.out.println(getId() + " " + getName()
                + "\nMasa: " + getMass() + " Kg"
                + "\nDencidad: " + getDensity() + " g/cm^3"
                + "\nDiametro: " + getDiameter() + " Radio (Km)"
                + "\nDistancia al Sol: " + getSun_distance() + " 10^3 Km");

        /**
         * Pintamos la respuesta de la atracción gravitatoria de este planeta
         * con respecto al sol.
         */
        System.out.println("La atracción gravitatoria de Mercurio es: " + respuesta + " NW");
    }

}
