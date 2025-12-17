import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(roll + " " + name + " " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String minName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Roll:");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String nm = sc.nextLine();
            System.out.println("Enter CGPA:");
            double cg = sc.nextDouble();

            s[i] = new Student(r, nm, cg);

            if (cg < minCgpa) {
                minCgpa = cg;
                minName = nm;
            }
        }

        System.out.println("\nStudent Details:");
        for (Student st : s) {
            st.display();
        }

        System.out.println("Student with lowest CGPA: " + minName);
    }
}