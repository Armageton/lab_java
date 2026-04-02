package Day_9;

import java.io.*;
import java.util.Scanner;

public class StudentFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Input student details
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            // File name
            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            // Write to file
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Roll No: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.write("----------------------\n");
            fw.close();

            System.out.println("Student details written to file.");

            // Read from file
            System.out.println("\nDisplaying file contents:\n");

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}