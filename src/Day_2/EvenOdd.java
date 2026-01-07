import java.util.*;

class EvenOdd {

    int even = 0,odd = 0;
    EvenOdd(int[] n){
        for (int i = 0; i < 10 ; i++){
            if (n[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
    }
    void displayEvenOdd(){
        System.out.println("Total Even number are -"+even);
        System.out.println("Total Odd number are -"+odd);
    }
}

class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        EvenOdd eo = new EvenOdd(num);
        eo.displayEvenOdd();
    }
}