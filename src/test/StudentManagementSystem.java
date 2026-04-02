package test;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double cgpa;

    Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(rollNo + "\t" + name + "\t" + cgpa);
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student with Lowest CGPA");
            System.out.println("4. Search Student by Roll No");
            System.out.println("5. Save to File");
            System.out.println("6. Read from File");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: lowestCGPA(); break;
                case 4: searchStudent(); break;
                case 5: saveToFile(); break;
                case 6: readFromFile(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }
        } while (choice != 7);
    }

    static void addStudent() {
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            if (cgpa < 0 || cgpa > 10)
                throw new Exception("Invalid CGPA!");

            list.add(new Student(roll, name, cgpa));
            System.out.println("Student added successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    static void displayStudents() {
        System.out.println("\nRoll\tName\tCGPA");
        for (Student s : list)
            s.display();
    }

    static void lowestCGPA() {
        if (list.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        Student low = list.get(0);
        for (Student s : list) {
            if (s.cgpa < low.cgpa)
                low = s;
        }

        System.out.println("Student with Lowest CGPA:");
        low.display();
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (Student s : list) {
            if (s.rollNo == roll) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void saveToFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"));
            out.writeObject(list);
            out.close();
            System.out.println("Data saved to file.");
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }

    static void readFromFile() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"));
            list = (ArrayList<Student>) in.readObject();
            in.close();
            System.out.println("Data read from file.");
            displayStudents();
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}
