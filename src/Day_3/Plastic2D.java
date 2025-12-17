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