/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise;

/**
 *
 * @author User
 */
public class WaterBillManagementSystem {
    // Private properties - Encapsulation
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    // Constructor
    public WaterBillManagementSystem(String accountNumber, String customerName,
                     String customerType, double previousReading,
                     double currentReading) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

        public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }
    
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    public double getWaterBillRate() {

        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 10) {
                return 15.00;
            } else if (consumption <= 20) {
                return 18.00;
            } else {
                return 22.00;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 10) {
                return 20.00;
            } else if (consumption <= 20) {
                return 25.00;
            } else {
                return 30.00;
            }
        }

        return 0;
    }

    public double calculateWaterBill() {
        return calculateConsumption() * getWaterBillRate();
    }

    public String getClassify() {

        double consumption = calculateConsumption();

        if (consumption > 30) {
            return "WARNING: High Consumption";
        } else if (consumption > 20) {
            return "Moderate Consumption";
        } else {
            return "Normal Consumption";
        }
    }

    public void displayWaterBill() {

        System.out.println("========== San Jose Water District Bill ==========");
        System.out.println();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println();
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.printf("Consumption: %.0f m3%n", calculateConsumption());
        System.out.println();
        System.out.printf("Rate: P%.2f%n", getWaterBillRate());
        System.out.printf("Total Bill: P%.2f%n", calculateWaterBill());
        System.out.println("Classification: " + getClassify());

        System.out.println();
    }
}
    

