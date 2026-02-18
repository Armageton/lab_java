class Bank {
    int accountNo = 101; // non-static

    static class InterestCalculator {
        static double calculateSI(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void show() {
            // System.out.println(accountNo); ❌ NOT allowed
            System.out.println("Static nested class cannot access non-static members directly");
        }
    }

    public static void main(String[] args) {
        double si = Bank.InterestCalculator.calculateSI(1000, 5, 2);
        System.out.println("Simple Interest = " + si);

        Bank.InterestCalculator ic = new Bank.InterestCalculator();
        ic.show();
    }
}
