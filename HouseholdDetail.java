import java.util.Scanner;
public class HouseholdDetail {
    private static final String VALID_STATUS = "HML";
    private static int readInt(Scanner scanner, String prompt, int min) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value >= min) {
                    return value;
                }
                System.out.println("  Invalid input: value must be at least " + min + ".");
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input: please enter a whole number.");
            }
        }
    }
    private static double readDouble(Scanner scanner, String prompt, double min) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (Double.isFinite(value) && value >= min) {
                    return value;
                }
                System.out.println("  Invalid input: value must be at least " + min + ".");
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input: please enter a number (e.g. 350.5).");
            }
        }
    }
    private static char readStatus(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1 && VALID_STATUS.indexOf(input.charAt(0)) >= 0) {
                return input.charAt(0);
            }
            System.out.println("  Invalid input: enter H, M or L.");
        }
    }
    private static String describeStatus(char status) {
        switch (status) {
            case 'H':
                return "High";
            case 'M':
                return "Medium";
            case 'L':
                return "Low";
            default:
                return "Unknown";
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("==========================================");
            System.out.println("  Household Water-Usage & Billing Monitor ");
            System.out.println("==========================================");
            int houseNumber = readInt(scanner, "Enter house number                          : ", 1);
            int familyMembers = readInt(scanner, "Enter number of family members            : ", 1);
            double waterConsumed = readDouble(scanner, "Enter water consumed (litres)             : ", 0.0);
            char usageStatus = readStatus(scanner, "Enter usage status (H = High, M = Medium, L = Low): ");
            System.out.println();
            System.out.println("------------- Household Details -------------");
            System.out.printf("House Number          : %d%n", houseNumber);
            System.out.printf("Family Members        : %d%n", familyMembers);
            System.out.printf("Water Consumed        : %.2f litres%n", waterConsumed);
            System.out.printf("Water Usage Status    : %c (%s)%n", usageStatus, describeStatus(usageStatus));
            System.out.println("---------------------------------------------");
        }
    }
}