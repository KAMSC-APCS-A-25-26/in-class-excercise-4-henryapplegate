import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100)+1;
        int guess;
        System.out.println("Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100.");
        do{
            System.out.print("enter your guess: ");
            guess = sc.nextInt();

            if (guess < num){
                System.out.println("Too low! Try again.");
            }
            else if (guess > num){
                System.out.println("Too high! Try again.");
            }
            else if (guess == num){
                System.out.println("You got it!");
            }
        } while(guess != num);
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
