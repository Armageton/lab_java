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
