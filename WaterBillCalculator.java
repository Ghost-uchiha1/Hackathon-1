import java.util.Scanner;
public class WaterBillCalculator {
    private static final double LIMIT_LITRES = 500.0;
    private static final int LOW_BILL = 100;
    private static final int HIGH_BILL = 200;
    private static double readConsumption(Scanner scanner) {
        while (true) {
            System.out.print("Enter water consumption (in litres): ");
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (Double.isFinite(value) && value >= 0) {
                    return value;
                }
                System.out.println("  Invalid input: consumption cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input: please enter a number (e.g. 450.5).");
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================================");
            System.out.println("          Water Bill Calculator           ");
            System.out.println("==========================================");
            double consumption = readConsumption(scanner);
            int bill;
            if (consumption <= LIMIT_LITRES) {
                bill = LOW_BILL;
            } else {
                bill = HIGH_BILL;
            }
            System.out.println();
            System.out.println("------------- Bill Summary -------------");
            System.out.printf("Water Consumption : %.2f litres%n", consumption);
            System.out.printf("Water Bill        : Rs.%d%n", bill);
            System.out.println("----------------------------------------");
        }
    }
}