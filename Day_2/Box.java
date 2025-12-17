package Day_2;

import java.util.*;

class Box {
    double height,depth,length;
    Box(){
        height = 10;
        length = 10;
        depth = 10;
    }
    Box(double l,double h,double d){
        this.height=h;
        this.depth=d;
        this.length=l;
    }

    void display(){
        double p = 2 * (this.depth + this.length + this.height);
        System.out.println("Peremeter |>"+ p);

        double v = this.depth * this.length * this.height;
        System.out.println("Volume |>"+ v);
    }
}

class BoxDemo {
    public static void main(String[] args){
        int h,l,d;
        Scanner in = new Scanner(System.in);
        System.out.println("|Enter the data of box in lenght height Depth order|");
        l= in.nextInt();
        h= in.nextInt();
        d= in.nextInt();
        Box mybox1 = new Box(l,h,d);
        mybox1.display();
    }
}