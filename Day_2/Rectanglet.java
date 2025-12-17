import java.util.Scanner;

class Rectanglet {
    double length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double l = sc.nextDouble();
        System.out.println("Enter breadth:");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.area();
    }
}