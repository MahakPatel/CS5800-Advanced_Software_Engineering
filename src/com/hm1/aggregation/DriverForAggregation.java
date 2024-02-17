package com.hm1.aggregation;

public class DriverForAggregation {
    public static void run() {
        // Create instructor objects
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "7-7777");

        // Create textbook objects
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Data Structure & Algorithms in Java", "Robert Lafore", "Pearson");

        // Create course objects
        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Java Programming", instructor2, textbook2);

        // Print course information
        System.out.println("Course 1 Information:");
        course1.print();
        System.out.println();

        System.out.println("Course 2 Information:");
        course2.print();
    }
}
