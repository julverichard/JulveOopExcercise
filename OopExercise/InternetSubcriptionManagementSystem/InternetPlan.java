    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.InternetSubcriptionManagementSystem;

/**
 *
 * @author User
 */

public class InternetPlan {

    // Private attributes - Encapsulation
    private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    // Constructor
    public InternetPlan(String planCode, String customerName,
                        double monthlyFee, int monthsSubscribed) {
        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    // Getters
    

    // Methods to be overridden
    public double calculateMonthlyBill() {
        return monthlyFee;
    }

    public String getSpeed() {
        return "Unknown";
    }

    public String getPlanDescription() {
        return "Internet Plan";
    }

    // Get discount percentage
    public String getDiscount() {
        return "0%";
    }

    // Classification
    public String getClassification() {
        if (monthsSubscribed >= 12) {
            return "LONG-TERM SUBSCRIBER";
        } else {
            return "REGULAR SUBSCRIBER";
        }
    }

    // Display information
    public void displayPlan() {

        System.out.println("Customer: " + customerName);
        System.out.println("Plan: " + getPlanDescription());
        System.out.println("Speed: " + getSpeed());
        System.out.printf("Monthly Fee: P%.2f%n", monthlyFee);
        System.out.println("Months Subscribed: " + monthsSubscribed);
        System.out.println("Discount: " + getDiscount());
        System.out.printf("Monthly Bill: P%.2f%n", calculateMonthlyBill());
        System.out.println("Classification: " + getClassification());
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }
}
    

