import java.util.*;
class AddTwoNumber {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = a + b + a;
        System.out.println("Sum: "+c);
    }
}


