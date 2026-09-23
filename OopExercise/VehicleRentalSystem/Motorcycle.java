/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.VehicleRentalSystem;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {

        double rentalCost = rentalDays * 700;

        rentalCost = rentalCost + 100;

        return rentalCost;
    }
}
