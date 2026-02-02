package student.management.system;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + java.util.Arrays.toString(marks));
        System.out.println("Average: " + calculateAverage());
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter the number of subjects: ");
                    int numSubjects = scanner.nextInt();

                    int[] marks = new int[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                        marks[i] = scanner.nextInt();
                    }

                    Student newStudent = new Student(name, rollNumber, marks);
                    studentManagementSystem.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    studentManagementSystem.displayAllStudents();
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
