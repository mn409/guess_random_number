import java.util.Scanner;

public class GuessTheNumber {

    public static int generateRandomNumber(){
        return (int) (Math.random() * 100) + 1;
    }

    public static int getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess: (between 1 to 100)");
        int guess = sc.nextInt();
        return guess;
    }

    public static String checkGuess(int userGuess, int randomGuess){
        int difference = Math.abs(userGuess - randomGuess);

        if(userGuess == randomGuess){
            return "Congratulations! You guessed the number";
        } else if(difference <= 5){
            return "You are very close!";
        } else if(difference <= 10){
            return "You are close!";
        } else {
            return "You are far away!";
        }
    }

    public static void playGame(){
        int randomNumber = generateRandomNumber();
        int attempts = 5;
        Scanner sc = new Scanner(System.in);

        while(attempts > 0){
            int guess = getUserInput();
            String result = checkGuess(guess, randomNumber);
            System.out.println(result);

            if(guess == randomNumber) {
                break;
            }

            attempts--;
            if(attempts > 0){
                System.out.println("You have " + attempts + " attempts left.");
            } else {
                System.out.println("Game over! The correct answer was: " + randomNumber);
            }
        }
        sc.close();
    }

    public static void main(String[] args){
        System.out.println("Welcome to the number guessing game!");
        playGame();
        System.out.println("Thanks for playing!");
    }
}
