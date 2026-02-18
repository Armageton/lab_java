package Marketing;

import General.Employee;

public class Sales extends Employee {

    public Sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void display() {
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + earnings());
    }

    public static void main(String[] args) {
        Sales s = new Sales(123, "Amit", 1000);
        s.display();
    }
}
