package General;

public class Employee {
    protected int empid;
    private String ename;
    protected double basic;

    public Employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}
