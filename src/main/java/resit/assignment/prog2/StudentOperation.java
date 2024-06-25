package resit.assignment.prog2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentOperation(ArrayList<Student> students) {
        this.students = students;
        this.scanner = new Scanner(System.in);
    }

    // Method to add a new student
    public void addStudent() {
        System.out.println("Enter student details:");

        // Gather input from the user
        System.out.print("Student ID: ");
       String studentID = scanner.nextLine();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Gender (M/F): ");
        String gender = scanner.nextLine();
        System.out.print("Year of Admission: ");
        int yearOfAdmission = scanner.nextInt();
        System.out.print("Year of Graduation: ");
        int yearOfGraduation = scanner.nextInt();

        // Create a new student object and add it to the ArrayList
        Student newStudent = new Student(studentID, studentName, age, gender, yearOfAdmission, yearOfGraduation);
        students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    // Method to remove a student by ID
    public void removeStudent() {
        System.out.print("Enter the student ID to remove: ");
        int studentIDToRemove = scanner.nextInt();

        boolean found = false;
        // Iterate through the ArrayList to find and remove the student
        for (Student student : students) {
            if (student.getstudentID() == studentIDToRemove) {
                students.remove(student);
                found = true;
                System.out.println("Student with ID " + studentIDToRemove + " removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + studentIDToRemove + " does not exist.");
        }
    }

    // Method to update student details by ID
    public void updateStudentDetails() {
        System.out.print("Enter the student ID to update details: ");
        int studentIDToUpdate = scanner.nextInt();

        boolean found = false;
        // Iterate through the ArrayList to find the student
        for (Student student : students) {
            if (student.getstudentID() == studentIDToUpdate) {
                found = true;

                System.out.print("Enter new name (or press Enter to keep unchanged): ");
                String newName = scanner.nextLine().trim();
                if (!newName.isEmpty()) {
                    student.setStudentName(newName);
                }

                System.out.print("Enter new age (or enter 0 to keep unchanged): ");
                int newAge = scanner.nextInt();
                if (newAge != 0) {
                    student.setAge(newAge);
                }

                System.out.print("Enter new gender (M/F or enter any other character to keep unchanged): ");
                char newGender = scanner.next().charAt(0);
                if (newGender == 'M' || newGender == 'F') {
                    student.setGender(newGender);
                }

                System.out.print("Enter new year of admission (or enter 0 to keep unchanged): ");
                int newYearOfAdmission = scanner.nextInt();
                if (newYearOfAdmission != 0) {
                    student.setYearOfAdmission(newYearOfAdmission);
                }

                System.out.print("Enter new year of graduation (or enter 0 to keep unchanged): ");
                int newYearOfGraduation = scanner.nextInt();
                if (newYearOfGraduation != 0) {
                    student.setYearOfGraduation(newYearOfGraduation);
                }

                System.out.println("Student details updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + studentIDToUpdate + " does not exist.");
        }
    }

    // Method to search for a student by ID and display details
    public void searchStudentByID() {
        System.out.print("Enter the student ID to search: ");
        int studentIDToSearch = scanner.nextInt();

        boolean found = false;
        // Iterate through the ArrayList to find the student
        for (Student student : students) {
            if (student.getstudentID() == studentIDToSearch) {
                found = true;
                System.out.println("Student details:");
                System.out.println(student.toString());
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + studentIDToSearch + " does not exist.");
        }
    }

    // Method to print all graduate students' details to a file
    public void printGraduateStudents() {
        // Assuming Graduates class has a method to print details to a file
        Graduates.printDetailsToFile(students);
    }
}