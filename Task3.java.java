import java.util.Scanner;

public class CurrencyConverter {
    
    private static final double USD_TO_INR = 83.0;
    private static final double EUR_TO_INR = 90.0;
    private static final double GBP_TO_INR = 105.0;
    private static final double JPY_TO_INR = 0.55;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Currency Converter ---");
            System.out.println("1. INR → USD");
            System.out.println("2. INR → EUR");
            System.out.println("3. INR → GBP");
            System.out.println("4. INR → JPY");
            System.out.println("5. USD → INR");
            System.out.println("6. EUR → INR");
            System.out.println("7. GBP → INR");
            System.out.println("8. JPY → INR");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 8) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                double result = convert(choice, amount);
                System.out.println("Converted Amount = " + result);
            } else if (choice == 9) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);

        sc.close();
    }

    
    private static double convert(int choice, double amount) {
        return switch (choice) {
            case 1 -> amount / USD_TO_INR;   
            case 2 -> amount / EUR_TO_INR;   
            case 3 -> amount / GBP_TO_INR;   
            case 4 -> amount / JPY_TO_INR;  
            case 5 -> amount * USD_TO_INR;   
            case 6 -> amount * EUR_TO_INR;   
            case 7 -> amount * GBP_TO_INR; 
            case 8 -> amount * JPY_TO_INR;  
            default -> 0.0;
        };
    }
}
