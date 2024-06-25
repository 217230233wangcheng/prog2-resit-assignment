package resit.assignment.prog2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    private static StudentCollection studentCollection = new StudentCollection();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        readStudentDetailsFromFile("StudentDetails.csv");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. View all students' details");
            System.out.println("2. Add new student to the list");
            System.out.println("3. Search student details");
            System.out.println("4. Update a student's details");
            System.out.println("5. Remove a student");
            System.out.println("6. Print graduate students");
            System.out.println("7. QUIT");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after nextInt()

            switch (choice) {
                case 1:
                    viewAllStudents();
                    break;
                case 2:
                    addNewStudent(scanner);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    updateStudent(scanner);
                    break;
                case 5:
                    removeStudent(scanner);
                    break;
                case 6:
                    printGraduateStudents();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
            }
        }
    }

    private static void printGraduateStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printGraduateStudents'");
    }

    private static void removeStudent(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeStudent'");
    }

    private static void updateStudent(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStudent'");
    }

    private static void searchStudent(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchStudent'");
    }

    private static void addNewStudent(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewStudent'");
    }

    private static void viewAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewAllStudents'");
    }

    private static void readStudentDetailsFromFile(String filename) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 7) {
                    String id = parts[0].trim();
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    String gender = parts[3].trim();
                    int admissionYear = Integer.parseInt(parts[5].trim());
                    int graduationYear = Integer.parseInt(parts[6].trim());
                    Student student = new Student(id, name, age, gender, admissionYear, graduationYear);
                    studentCollection.addStudent(student);
                }
            }
            System.out.println("Student details loaded successfully from ");

        }
    }
}