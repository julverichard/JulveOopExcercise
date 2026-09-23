/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.VehicleRentalSystem;

/**
 *
 * @author User
 */
public class Car extends Vehicle {

    public Car(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {

        double rentalCost = rentalDays * 1500;

        if (rentalDays >= 7) {
            rentalCost = rentalCost - (rentalCost * 0.10);
        }

        return rentalCost;
    }
}
    

