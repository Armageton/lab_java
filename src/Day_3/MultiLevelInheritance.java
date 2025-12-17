package Day_3;

import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.println("Plate Constructor Called");
    }
}

// Derived class
class Box extends Plate {
    double height;

    Box() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();

        System.out.println("Box Constructor Called");
    }
}

// Derived class
class WoodBox extends Box {
    double thick;

    WoodBox() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thickness: ");
        thick = sc.nextDouble();

        System.out.println("WoodBox Constructor Called");
    }

    void display() {
        System.out.println("\nDimensions are:");
        System.out.println("Length = " + length);
        System.out.println("Width  = " + width);
        System.out.println("Height = " + height);
        System.out.println("Thickness = " + thick);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox();
        wb.display();
    }
}
