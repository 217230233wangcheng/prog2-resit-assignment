package resit.assignment.prog2;

import java.util.ArrayList;

public class StudentCollection {
    private ArrayList<Student> students;

    public StudentCollection() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // Return null if student not found
    }

    public void updateStudent(String id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}