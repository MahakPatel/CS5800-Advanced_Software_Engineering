package com.hm1.inheritance;

public class DriverForInheritance {

    private SalariedEmployee salariedEmployee1;
    private SalariedEmployee salariedEmployee2;
    private HourlyEmployee hourlyEmployee1;
    private HourlyEmployee hourlyEmployee2;
    private CommissionEmployee commissionEmployee1;
    private CommissionEmployee commissionEmployee2;
    private BaseEmployee baseEmployee;

    public DriverForInheritance() {
        // Instantiate each of the classes and populate with provided data
        salariedEmployee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        commissionEmployee1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 1.5, 50000);
        salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 2.2, 40000);
    }

    public void print() {
        // Display information
        System.out.println("Salaried Employee 1:");
        System.out.println("Name: " + salariedEmployee1.getFirstName() + " " + salariedEmployee1.getLastName());
        System.out.println("Social Security Number: " + salariedEmployee1.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + salariedEmployee1.getWeeklySalary());
        System.out.println();

        System.out.println("Salaried Employee 2:");
        System.out.println("Name: " + salariedEmployee2.getFirstName() + " " + salariedEmployee2.getLastName());
        System.out.println("Social Security Number: " + salariedEmployee2.getSocialSecurityNumber());
        System.out.println("Weekly Salary: $" + salariedEmployee2.getWeeklySalary());
        System.out.println();

        System.out.println("Hourly Employee 1:");
        System.out.println("Name: " + hourlyEmployee1.getFirstName() + " " + hourlyEmployee1.getLastName());
        System.out.println("Social Security Number: " + hourlyEmployee1.getSocialSecurityNumber());
        System.out.println("Hourly Wage: $" + hourlyEmployee1.getWage());
        System.out.println("Hours Worked: " + hourlyEmployee1.getHoursWorked());
        System.out.println();

        System.out.println("Hourly Employee 2:");
        System.out.println("Name: " + hourlyEmployee2.getFirstName() + " " + hourlyEmployee2.getLastName());
        System.out.println("Social Security Number: " + hourlyEmployee2.getSocialSecurityNumber());
        System.out.println("Hourly Wage: $" + hourlyEmployee2.getWage());
        System.out.println("Hours Worked: " + hourlyEmployee2.getHoursWorked());
        System.out.println();

        System.out.println("Commission Employee 1:");
        System.out.println("Name: " + commissionEmployee1.getFirstName() + " " + commissionEmployee1.getLastName());
        System.out.println("Social Security Number: " + commissionEmployee1.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + commissionEmployee1.getCommissionRate());
        System.out.println();

        System.out.println("Commission Employee 2:");
        System.out.println("Name: " + commissionEmployee2.getFirstName() + " " + commissionEmployee2.getLastName());
        System.out.println("Social Security Number: " + commissionEmployee2.getSocialSecurityNumber());
        System.out.println("Commission Rate: " + commissionEmployee2.getCommissionRate());
    }
}
