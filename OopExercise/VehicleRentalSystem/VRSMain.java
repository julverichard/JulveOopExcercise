/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.VehicleRentalSystem;

/**
 *
 * @author User
 */
public class VRSMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("C81","Toyota","Vios",7),
                              new Motorcycle("M211","Honda","Click 125",3),
                              new Van("V81","Toyota","Hiace",2)};

        System.out.println("=============== VEHICLE RENTAL ===============");
        System.out.println();
        for (Vehicle vehicle : vehicles) {

            System.out.println("Vehicle: "
                    + vehicle.getClass().getSimpleName());

            vehicle.displayRentalVehicle();

            System.out.println();
        }
    }
}
    

