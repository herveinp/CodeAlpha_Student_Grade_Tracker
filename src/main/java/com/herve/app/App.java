package com.herve.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.herve.app.Object.Student;

/**
 * Student Grade Tracker App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a scanner object to get user's input data.
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize a Student object.
        System.out.println("\nEnter the student's name, major, class year, and total subjects:");
        Student student = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());

        // Generate studentId value using generateStudentId() method.
        student.setStudentId(generateStudentId(student.getName(), student.getMajor(), student.getClassYear()));

        // Enter the grades for the total subjects of the student.
        System.out.println("\nEnter the grades for each of the " + String.valueOf(student.getTotalSubjects()) + " subjects for the student \n(the grade should be in the range of 0 to 100):");
        for (int i = 0; i < student.getTotalSubjects(); i++) {
            student.addGrade(scanner.nextInt());
        }

        // Set the student's averageGrades
        student.setAverageGrades(averageGrades(student.getStudentGrades()));

        // Set the student's highestGrade
        student.setHighestGrade(lowestAndHighestGrades(student.getStudentGrades()).get(1));

        // Set the student's lowestGrade
        student.setLowestGrade(lowestAndHighestGrades(student.getStudentGrades()).get(0));

        // Close scanner object
        scanner.close();

        // Display all of the student's information.
        System.out.println("\n--- A Student Information ---");
        System.out.println("Name           : " + student.getName());
        System.out.println("Major          : " + student.getMajor());
        System.out.println("Class Year     : " + student.getClassYear());
        System.out.println("Student Id     : " + student.getStudentId());
        System.out.println("Grade          : " + student.getStudentGrades());
        System.out.println("Average Grades : " + String.valueOf(student.getAverageGrades()));
        System.out.println("Highest Grade  : " + String.valueOf(student.getHighestGrade()));
        System.out.println("Lowest Grade   : " + String.valueOf(student.getLowestGrade()));
    }

    public static String generateStudentId(String name, String major, String classYear){
        // Replace the blank space characters in the String 'name' with underscore characters.s
        String formmatedName = name.replace(" ", "_");
        
        // Replace the blank space characters in the String 'major' with underscore characters.
        String formmatedMajor = major.replace(" ", "_");

        // Return the studentId value using the {name}-{major}-{classYear} template.
        return String.format("%s-%s-%s", formmatedName, formmatedMajor, classYear);
    }

    public static double averageGrades(ArrayList<Integer> studentGrades){
        // Check the studentGrades array list size must be greater than zero.
        if (studentGrades.size() > 0) {
            // Initialize sum value as zero.
            int sum = 0;

            // Sum all of grades in studentGrades array list.
            for (int grade : studentGrades) {
                sum += grade;
            }
            
            // Calculate the average grades of all subjects.
            double averageGrades = (double) sum / studentGrades.size();

            // Return the average grades.
            return averageGrades;
        } else {
            throw new IllegalArgumentException("The studentGrades array list is empty."); // Return an exception if the studentGrades array list is empty.
        }
    }

    public static ArrayList<Integer> lowestAndHighestGrades(ArrayList<Integer> studentGrades){
        // Create a lowestAndHighestGrades array list to save the lowest grade (1) and highest grade(2) in the same place.
        ArrayList<Integer> lowestAndHighestGrades = new ArrayList<>(2);

        // Check the studentGrades array list size must be greater than zero.
        if (studentGrades.size() > 0) {
            // Initialize the min and max variables using the first values from the studentGrades array list.
            int min = studentGrades.get(0);
            int max = studentGrades.get(0);

            for (int grade : studentGrades){
                if (grade < min){
                    min = grade; // Find the lowest grade.
                }

                if (grade > max){
                    max = grade; // Find the highest grade.
                }
            }

            // Add the min and max values to the lowestAndHighestGrades array list.
            lowestAndHighestGrades.add(min);
            lowestAndHighestGrades.add(max);

            // Return the lowestAndHighestGrades array list.
            return lowestAndHighestGrades;
        } else {
            throw new IllegalArgumentException("The studentGrades array list is empty."); // Return an exception if the studentGrades array list is empty.
        }
    }
}
