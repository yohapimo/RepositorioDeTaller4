/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_4;

/**
 * Clase Vehiculo
 *
 * Se implementa métodos necesarios para la obtención de datos.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public abstract class Vehicle {

    /**
     * Atributos necesarios
     */
    public String type;
    public int numPassengers;
    public int numWheels;
    public boolean Active = true;
    public String dateInscription;
    public String Fuel;
    public double Kilometers;

    /**
     *
     * @param type
     * @param numPassengers
     * @param numWheels
     * @param dateInscription
     * @param Fuel
     * @param Kilometers
     */
    public Vehicle(String type, int numPassengers, int numWheels, String dateInscription, String Fuel, double Kilometers) {
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWheels = numWheels;
        this.dateInscription = dateInscription;
        this.Fuel = Fuel;
        this.Kilometers = Kilometers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getFuel() {
        return Fuel;
    }

    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }

    public double getKilometers() {
        return Kilometers;
    }

    public void setKilometers(double Kilometers) {
        this.Kilometers = Kilometers;
    }

    /**
     * Método ToString
     *
     * @return Datos.
     */
    @Override
    public String toString() {
        return "Vehiculo =>" + "\nTipo: " + type + "\npasajeros: " + numPassengers + "\nNúmero Ruedas:" + numWheels + "\nFecha Inscripción: " + dateInscription + "\nCombustible: " + Fuel + "\nKilometros: " + Kilometers + "\n";
    }

}
