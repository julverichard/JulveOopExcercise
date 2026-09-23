/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise;

/**
 *
 * @author User
 */
public class EPSMain {

    public static void main(String[] args) {

        // Create Employee object
        EmployeePayrollSystem employee = new EmployeePayrollSystem(
                "E-001",
                "Pedro Cruz",
                "Programmer",
                45,
                250
        );

        // Display payroll
        employee.displayEmployeePayroll();
    }
}

