package resit.assignment.prog2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Graduates {
    private ArrayList<Student> students;

    public Graduates(ArrayList<Student> students) {
        this.students = students;
    }

    public void printGraduates() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("GraduateStudents.txt"))) {
            writer.write("Following students have graduated so far.\n");
            writer.write(String.format("%-12s%-15s%-6s%-8s%-8s%-8s\n",
                                       "Student ID", "Student Name", "Age", "Gender", "Adm Year", "Grad Year"));
            for (Student student : students) {
                if (student.hasGraduated()) {
                    writer.write(student.toString() + "\n");
                }
            }
            System.out.println("Successfully wrote graduate student details to GraduateStudents.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void printDetailsToFile(ArrayList<Student> students2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDetailsToFile'");
    }
}