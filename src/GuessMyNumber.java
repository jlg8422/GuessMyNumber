import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10) + 1;
        boolean isCorrect = false;
        Scanner in = new Scanner(System.in);

        //while( isCorrect == false)

        System.out.println("Welcome to GuessMyNumber");


        while (!isCorrect) {

            System.out.print("Guess a number from 1 to 10: ");

             String userGuess = in.nextLine();

            System.out.println("Your Guess: " + userGuess);

            String numberAsString = String.valueOf(number);
            if (userGuess.equals(numberAsString)) {
                System.out.println("Your guess is correct!");
                isCorrect = true;
            }
            else {
                System.out.println("Your guess is incorrect :(");

            }
        }


    }
}

