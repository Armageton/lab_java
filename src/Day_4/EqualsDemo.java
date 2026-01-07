package Day_4;

abstract class Students {
    int rollNo;
    String name;

    Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Students s = (Students) obj;
        return this.rollNo == s.rollNo && this.name.equals(s.name);
    }

    abstract void course();
}

public class EqualsDemo {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Rahul");
        Students s2 = new Students(101, "Rahul");

        if (s1.equals(s2))
            System.out.println("Both students are equal");
        else
            System.out.println("Students are not equal");
    }
}
