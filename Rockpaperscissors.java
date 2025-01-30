import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter 'rock', 'paper', or 'scissors' to play.");
        
        while (true) {
            System.out.print("Enter your choice (or type 'exit' to quit): ");
            String userChoice = scanner.nextLine().toLowerCase();
            
            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.println("Invalid input, please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }
            
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
                       (userChoice.equals("paper") && computerChoice.equals("rock")) || 
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}