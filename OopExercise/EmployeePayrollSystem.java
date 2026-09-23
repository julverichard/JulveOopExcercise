/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OopExercise;

/**
 *
 * @author User
 */
public class EmployeePayrollSystem {
    private String employeeId;
    private String name;
    private String position;
    private double hoursWorked;
    private double hourlyRate;

    public EmployeePayrollSystem(String employeeId, String name, String position,
                    double hoursWorked, double hourlyRate) {

        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateRegular() {

        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            return 40 * hourlyRate;
        }
    }

    public double calculateOvertime() {

        if (hoursWorked > 40) {

            double overtimeHours = hoursWorked - 40;
            double overtimeRate = hourlyRate * 1.50;

            return overtimeHours * overtimeRate;

        } else {
            return 0;
        }
    }

    public double calculateGross() {

        return calculateRegular() + calculateOvertime();
    }

    public double calculateDeduction() {

        double grossPay = calculateGross();

        if (grossPay <= 10000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.10;
        }
    }

    public double calculateNetPay() {

        return calculateGross() - calculateDeduction();
    }

    public String getEmployeeClassification() {

        if (hoursWorked < 20) {
            return "Part-Time";
        } else if (hoursWorked <= 40) {
            return "Regular";
        } else {
            return "Overtime Worker";
        }
    }
    public void displayEmployeePayroll() {

        System.out.println("=============== EMPLOYEE PAYROLL ===============");
        System.out.println();

        System.out.println("Employee ID: " + employeeId);
        System.out.println();
        
        System.out.println("Name: " + name);
        System.out.println();
        
        System.out.println("Position: " + position);
        System.out.println();

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Rate: P%.2f%n", hourlyRate);
        System.out.println();

        System.out.printf("Regular Pay: P%.2f%n", calculateRegular());
        System.out.printf("Overtime Pay: P%.2f%n", calculateOvertime());
        System.out.printf("Gross Pay: P%.2f%n", calculateGross());
        System.out.printf("Deduction: P%.2f%n", calculateDeduction());
        System.out.printf("Net Pay: P%.2f%n", calculateNetPay());

        System.out.println();
        System.out.println("Classification: " + getEmployeeClassification());
    }
}

