/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Lista Vehiculos.
 *
 * Se implementa métodos necesarios para la obtención de datos.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class ListVehicle extends Vehicle {

    /**
     *
     * @param type
     * @param numPassengers
     * @param numWheels
     * @param dateInscription
     * @param Fuel
     * @param Kilometers
     */
    public ListVehicle(String type, int numPassengers, int numWheels, String dateInscription, String Fuel, double Kilometers) {
        super(type, numPassengers, numWheels, dateInscription, Fuel, Kilometers);
    }

    /**
     * Se crea el ArrayList donde tendremos lo datos de los vehículos y sus
     * atributos.
     */
    public void createData() {

        ListVehicle car1 = new ListVehicle("Car", 5, 4, "2008-05-25", "Gasolina", 17000.12);
        ListVehicle car2 = new ListVehicle("Bus", 45, 10, "20020-07-02", "Diesel", 50000.5);
        ListVehicle car3 = new ListVehicle("Metro", 1500, 20000, "2019-01-30", "Electric", 4000.4);
        ListVehicle car4 = new ListVehicle("Bike", 1, 2, "2017-08-11", "N/A", 17000.9);
        ListVehicle car5 = new ListVehicle("Electric Car", 4, 4, "2020-09-22", "Electric", 2000.1);
        ListVehicle car6 = new ListVehicle("Truck", 2, 22, "2015-04-19", "Diesel", 8000.2);
        ListVehicle car7 = new ListVehicle("Van", 8, 4, "2017-06-03", "Gasolina", 80000.9);
        ListVehicle car8 = new ListVehicle("Scooter", 2, 2, "2021-01-07", "gasolina", 3000.3);
        ListVehicle car9 = new ListVehicle("ATV", 2, 4, "2018-09-10", "gasolina", 8000.7);
        ListVehicle car10 = new ListVehicle("Electric Bike", 1, 2, "2021-02-30", "Electric", 2000.8);

        List<ListVehicle> vehicles = new ArrayList<ListVehicle>();

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(car4);
        vehicles.add(car5);
        vehicles.add(car6);
        vehicles.add(car7);
        vehicles.add(car8);
        vehicles.add(car9);
        vehicles.add(car10);

        /**
         * Método para saber cuántos datos hay en la base de datos.
         */
        System.out.println("Nuestro Ferry cuenta con " + vehicles.size() + " Vehiculos");
        //System.out.println(vehicles.get(3));// traermos una fila especifica

        for (ListVehicle e : vehicles) {
            System.out.println(e);
        }

    }
}
