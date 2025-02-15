package hus.oop.lab2.exerciseonarray.gradesstatistics;

import java.util.Scanner;

public class GradesStatistics {
    
    public int[] generateStudentGrades(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        return grades;
    }

    public void simpleGradesStatistics() {
        Scanner in = new Scanner(System.in);
        int[] grades = generateStudentGrades(in);
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int grade : grades) {
            sum += grade;
            if (grade < min) min = grade;
            if (grade > max) max = grade;
        }
        double average = (double) sum / grades.length;
        System.out.printf("The average is: %.2f%n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
