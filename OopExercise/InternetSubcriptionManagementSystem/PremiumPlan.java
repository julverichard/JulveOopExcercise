/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.InternetSubcriptionManagementSystem;

/**
 *
 * @author User
 */
public class PremiumPlan extends InternetPlan {

    public PremiumPlan(String planCode, String customerName,
                       int monthsSubscribed) {

        super(planCode, customerName, 2499, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {

        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 12) {
            bill = bill - (bill * 0.15);
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }

    @Override
    public String getDiscount() {

        if (getMonthsSubscribed() >= 12) {
            return "15%";
        }

        return "0%";
    }
}
