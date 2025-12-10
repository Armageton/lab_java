import java.util.Scanner;
class WeekDay {
    int day;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day Number (1–7): ");
        day = sc.nextInt();
    }

    void showDay() {
        switch(day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid Day Number");
        }
    }

    public static void main(String[] args) {
        WeekDay w = new WeekDay();
        w.input();
        w.showDay();
    }
}
