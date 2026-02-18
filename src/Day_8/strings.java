package Day_8;
import java.util.Scanner;

public class strings
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);


        System.out.println("\n(ii) Reverse first string:");
        System.out.println(reverseString(str1));


        System.out.println("\n(iii) Compare two strings:");
        if (str1.equals(str2))
            System.out.println("The strings are equal.");
        else
            System.out.println("The strings are not equal.");


        System.out.print("\nEnter index to insert second string into first: ");
        int index = sc.nextInt();
        if (index >= 0 && index <= str1.length()) {
            System.out.println("After insertion:");
            System.out.println(insertString(str1, str2, index));
        } else
            System.out.println("Invalid index.");


        System.out.println("\n(v) Upper case: " + str1.toUpperCase());
        System.out.println("Lower case: " + str1.toLowerCase());


        int pos = str1.indexOf(ch);
        System.out.println("\n(vi) Position of character '" + ch + "': " + (pos == -1 ? "Not found" : pos));


        String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println("\n(vii) Is the first string palindrome? " + isPalindrome(cleanStr1));


        int[] counts = countWordsVowelsConsonants(str1);
        System.out.println("\n(viii) Words: " + counts[0]);
        System.out.println("Vowels: " + counts[1]);
        System.out.println("Consonants: " + counts[2]);

        sc.close();
    }


    private static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }


    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    private static String insertString(String s1, String s2, int index) {
        StringBuilder sb = new StringBuilder(s1);
        sb.insert(index, s2);
        return sb.toString();
    }


    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        return true;
    }


    private static int[] countWordsVowelsConsonants(String s) {
        int words = 0, vowels = 0, consonants = 0;
        boolean inWord = false;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                inWord = true;
                char lc = Character.toLowerCase(c);
                if ("aeiou".indexOf(lc) != -1) vowels++;
                else consonants++;
            } else {
                if (inWord) {
                    words++;
                    inWord = false;
                }
            }
        }
        if (inWord) words++; // last word

        return new int[]{words, vowels, consonants};
    }
}