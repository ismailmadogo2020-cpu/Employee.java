import java.util.Scanner;

class Bill {
    private int Units;
    private double StandingFee;
    private double costPerUnit;

    public Bill(int Units, double StandingFee) {
        this.Units = Units;
        this.StandingFee = StandingFee;
    }

    public void calculateCost() {
        costPerUnit = 55.0;
        double totalCost = (Units * costPerUnit) + StandingFee;
        System.out.println("Total amount payable Ksh " + totalCost);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter units consumed by the customer for the month: ");
        int units = scanner.nextInt();
        System.out.println("Enter standing fee: ");
        double standingFee = scanner.nextDouble();
        Bill bill = new Bill(units, standingFee);
        bill.calculateCost();
        scanner.close();
    }
}