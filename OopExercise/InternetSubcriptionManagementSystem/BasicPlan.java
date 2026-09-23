/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.InternetSubcriptionManagementSystem;

/**
 *
 * @author User
 */
public class BasicPlan extends InternetPlan {

    public BasicPlan(String planCode, String customerName,
                     int monthsSubscribed) {

        super(planCode, customerName, 999, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {

        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 6) {
            bill = bill - (bill * 0.05);
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }

    @Override
    public String getDiscount() {

        if (getMonthsSubscribed() >= 6) {
            return "5%";
        }

        return "0%";
    }
}
