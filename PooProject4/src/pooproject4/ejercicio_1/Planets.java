/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_1;

/**
 * Clase Planets
 *
 * se realizan las instancias utilizadas según el caso.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public abstract class Planets {

    public int id;
    public String name;
    public double mass;
    public double density;
    public double diameter;
    public double sun_distance;
    public double constG;

    public Planets(int id, String name, double mass, double density,
            double diameter, double sun_distance, double constG) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.sun_distance = sun_distance;
        this.constG = constG;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSun_distance() {
        return sun_distance;
    }

    public void setSun_distance(double sun_distance) {
        this.sun_distance = sun_distance;
    }

    public double getConstG() {
        return constG;
    }

    public void setConstG(double constG) {
        this.constG = constG;
    }

}
