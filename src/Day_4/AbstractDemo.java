package Day_4;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}

class Kiitian extends Student {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput(2205180, 1234567890L);
        k.display();
    }
}
