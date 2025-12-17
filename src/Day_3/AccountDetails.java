package Day_3;

import java.util.Scanner;

// Base class
class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class Person extends Account {
    String name;
    long aadhar_no;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();
        super.input();   // calling Account input()
    }

    // Overriding disp()
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}




// Main class
public class AccountDetails {
    public static void main(String[] args) {

        Person p[] = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            p[i] = new Person();
            p[i].input();
        }

        System.out.println("\nDisplaying Details of Three Persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }
    }
}
