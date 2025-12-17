import java.util.Scanner;
class Palindrome {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
    }

    void check() {
        int original = num;
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (original == rev)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is NOT a Palindrome");
    }
}
class palindromeDemo {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.input();
        p.check();
    }
}
