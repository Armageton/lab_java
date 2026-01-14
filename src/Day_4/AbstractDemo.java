package Day_4;

import java.util.Scanner;

// Abstract class
abstract class Students {
    int rollno;
    long regno;

    // Method to read input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        rollno = sc.nextInt();

        System.out.print("Enter Registration no: ");
        regno = sc.nextLong();
    }

    // Abstract method
    abstract void course();
}

// Subclass
class Kiitian extends Students {

    // Implementing abstract method
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    // Method to display details
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

// Driver class
public class AbstractDemo {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();
        k.display();
    }
}
