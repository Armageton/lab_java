import java.util.Scanner;
class FullName {
    String first, last;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        first = sc.nextLine();

        System.out.print("Enter Last Name: ");
        last = sc.nextLine();
    }

    void display() {
        System.out.println("Output: " + last + " " + first);
    }
}
class FullNameDemo
{
    public static void main(String[] args) {
        FullName n = new FullName();
        n.input();
        n.display();
    }
}
