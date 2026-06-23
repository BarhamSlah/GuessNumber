import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        System.out.println("WELCOME TO GUESS NUMBER GAME");

        Random random = new Random();

        int exactNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int yourNumber;

        int attempt = 0;

        do {
            System.out.print("Enter your number please from 0 to 100 ");
             yourNumber = scanner.nextInt();
             
            if (yourNumber == exactNumber) {
                System.out.println("You guess the number , You won the game 🥳🏆🥇🏅");

            } else if (yourNumber > exactNumber) {
                System.out.println("Your number is higher , please enter a smaller number");

            } else {
                System.out.println("Your number is lower , please enter a larger number");
            }

            attempt ++;

        }
        while(yourNumber != exactNumber);

        System.out.println("You can guess the number by " + attempt + " attempt ");

        if(attempt == 1){
            System.out.println("What a perfect answer 🥇🥇🥇🥇🥇🥇🥇🥇🥇🥇🥇 ");
        } else if (attempt <= 3 ){
            System.out.println("You are clever");
        } else if (attempt <= 6){
            System.out.println("Well done");
        } else {
            System.out.println("Thakns for God , At last");
        }

        scanner.close();
    }
}
