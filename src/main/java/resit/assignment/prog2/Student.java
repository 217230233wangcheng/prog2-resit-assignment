package resit.assignment.prog2;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private int admissionYear;
    private int graduationYear;

    public Student(String studentID, String name, int age, String gender2, int admissionYear, int graduationYear) {
        this.id = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender2;
        this.admissionYear = admissionYear;
        this.graduationYear = graduationYear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public boolean hasGraduated() {
        return graduationYear <= getCurrentYear();
    }

    private int getCurrentYear() {
        return 2024; // Assuming current year is 2024 for demonstration
    }

    @Override
    public String toString() {
        return String.format("Student ID: %-5s Name: %-15s Age: %-3d Gender: %-2s Admission Year: %-4d Graduation Year: %-4d",
                id, name, age, gender, admissionYear, graduationYear);
    }

    public int getstudentID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getstudentID'");
    }

    public void setStudentName(String newName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStudentName'");
    }

    public void setAge(int newAge) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }

    public void setGender(char newGender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGender'");
    }

    public void setYearOfAdmission(int newYearOfAdmission) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setYearOfAdmission'");
    }

    public void setYearOfGraduation(int newYearOfGraduation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setYearOfGraduation'");
    }
}