import java.util.Scanner;
public class TotalWaterConsumption {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    private static int readUsage(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= 0) {
                    return value;
                }
                System.out.println("  Invalid input: usage cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input: please enter a whole number.");
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================================");
            System.out.println("     Total Water Consumption Calculator   ");
            System.out.println("==========================================");
            int morningUsage = readUsage(scanner, "Enter morning water usage (litres): ");
            int eveningUsage = readUsage(scanner, "Enter evening water usage (litres): ");
            int totalUsage = calculateTotal(morningUsage, eveningUsage);
            System.out.println();
            System.out.println("------------ Consumption Summary ------------");
            System.out.printf("Morning Usage      : %d litres%n", morningUsage);
            System.out.printf("Evening Usage      : %d litres%n", eveningUsage);
            System.out.printf("Total Consumption  : %d litres%n", totalUsage);
            System.out.println("---------------------------------------------");
        }
    }
}