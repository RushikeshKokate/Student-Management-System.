
import java.util.ArrayList;
import java.util.Scanner;



	class Student {
	    private String name;
	    private int rollNumber;
	    private int age;
	    private String grade;

	    public Student(String name, int rollNumber, int age, String grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.age = age;
	        this.grade = grade;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Age: " + age);
	        System.out.println("Grade: " + grade);
	        System.out.println();
	    }
	}



public class Studentmanage {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = scanner.next();

                    Student student = new Student(name, rollNumber, age, grade);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    System.out.println();
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("Student List:");
                        for (Student s : students) {
                            s.displayInfo();
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("Thank you for using the Student Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}

