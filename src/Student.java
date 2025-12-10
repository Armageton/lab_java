import java.util.Scanner;

class Student {
    String name, section;
    int roll;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Section: ");
        section = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.display();
    }
}
