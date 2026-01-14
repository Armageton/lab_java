package Day_4;

import java.util.Scanner;

class Stud {
    int rollno;
    long regno;

    // Constructor
    Stud(int rollno, long regno) {
        this.rollno = rollno;
        this.regno = regno;
    }

    // Overriding equals() method
    public boolean equals(Object obj) {
        Stud s = (Stud) obj;
        return this.rollno == s.rollno && this.regno == s.regno;
    }
}

// Driver class
public class EqualsDemo {
    public static void main(String[] args) {
        Stud s1 = new Stud(101, 1234567890L);
        Stud s2 = new Stud(101, 1234567890L);

        if (s1.equals(s2)) {
            System.out.println("Both students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }
}
