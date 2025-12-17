import java.util.Scanner;

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

