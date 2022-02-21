/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject4.ejercicio_4;

/**
 * Clase Main.
 *
 * Crear clase principal para imprimir la lista con los datos de los vehículos.
 *
 * @version 01.01.01 2022-02-20
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
public class MainEjercicio4 {

    public static void main(String[] args) {

        /**
         * Se crear Main donde aplicamos creación de segundo main en un mismo
         * proyecto y se instancia la lista de vehículos para la obtención de
         * los datos.
         */
        ListVehicle objVehicle = new ListVehicle("Tipo de Vehiculo", 0, 0, "Fecha", "Combustible", 0.0);
        objVehicle.createData();

    }
}
