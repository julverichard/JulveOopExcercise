/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise;

/**
 *
 * @author User
 */
public class WBMSMain {

    public static void main(String[] args) {

        // Create 3 WaterBill objects

        WaterBillManagementSystem customer1 = new WaterBillManagementSystem("W-1001","Maria Santos","Residential",120,145);
        WaterBillManagementSystem customer2 = new WaterBillManagementSystem("W-1002","Rafael Aragon","Residential",200,220);
        WaterBillManagementSystem customer3 = new WaterBillManagementSystem("W-1003","Andres Caitum","Commercial",500,540);
        
        customer1.displayWaterBill();
        customer2.displayWaterBill();
        customer3.displayWaterBill();
        
    }
}
    

