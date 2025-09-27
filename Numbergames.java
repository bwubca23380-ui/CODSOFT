import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGameWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        
        // Initialize variable for the user's guess
        int guess = 0;

        // Inform the user about the game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            // Get the user's guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            // Check if the guess is too high, too low, or correct
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You've guessed the number.");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
