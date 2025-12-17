import java.util.Scanner;

class ObjectCounter {
    static int c = 0;
    ObjectCounter(){
        c++;
    }
    static void displayCount(){
        System.out.println("Total Objects created -"+c);
    }
}

class Demo {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of object you want to create -");
        n = in.nextInt();
        for(int i = 0; i < n ; i++){
            ObjectCounter obj = new ObjectCounter();
        }

        ObjectCounter.displayCount();

    }
}