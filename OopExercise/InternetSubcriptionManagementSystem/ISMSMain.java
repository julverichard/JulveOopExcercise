/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise.InternetSubcriptionManagementSystem;

/**
 *
 * @author User
 */
public class ISMSMain {
    public static void main(String[] args) {

        // InternetPlan array
        InternetPlan[] plans = {

            new BasicPlan(
                    "B-001",
                    "Juan Dela Cruz",
                    6
            ),

            new StandardPlan(
                    "S-001",
                    "Ana Reyes",
                    12
            ),

            new PremiumPlan(
                    "P-001",
                    "Mark Santos",
                    15
            )
        };

        System.out.println("===== INTERNET SUBSCRIPTION =====");
        System.out.println();

        // Polymorphism
        for (InternetPlan plan : plans) {

            plan.displayPlan();

            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
        }
    }
}
