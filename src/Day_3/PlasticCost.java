package Day_3;

import java.util.Scanner;

// 2D Plastic Sheet
class Plastic2D {
    double length, breadth;
    double cost2D = 40;

    void read2D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (in ft): ");
        length = sc.nextDouble();
        System.out.print("Enter breadth (in ft): ");
        breadth = sc.nextDouble();
    }

    void calculate2D() {
        double area = length * breadth;
        double totalCost = area * cost2D;
        System.out.println("Cost of 2D Plastic Sheet = Rs. " + totalCost);
    }
}

// 3D Plastic Box (inherits 2D)
class Plastic3D extends Plastic2D {
    double height;
    double cost3D = 60;

    void read3D() {
        read2D();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height (in ft): ");
        height = sc.nextDouble();
    }

    void calculate3D() {
        double volume = length * breadth * height;
        double totalCost = volume * cost3D;
        System.out.println("Cost of 3D Plastic Box = Rs. " + totalCost);
    }
}

// Main Class
public class PlasticCost {
    public static void main(String[] args) {
        Plastic3D obj = new Plastic3D();

        System.out.println("Enter dimensions for Plastic:");
        obj.read3D();

        System.out.println("\nOutput:");
        obj.calculate2D();
        obj.calculate3D();
    }
}
