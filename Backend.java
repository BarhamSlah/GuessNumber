import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        System.out.println(MyColors.GREEN + "WELCOME TO GUESS NUMBER GAME 😊" + MyColors.RESET);
        System.out.println(MyColors.BOLD + "The rules of game : 1- Your number should be from 0 to 100" + MyColors.RESET);
        System.out.println(MyColors.BOLD + "The rules of game : 2- You have only 10 attempts to guessing the number " + MyColors.RESET);
        System.out.println(MyColors.RED + "If you break rule of game , you consider as a loser 🤬" + MyColors.RESET);

        Random random = new Random();

        int exactNumber = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int yourNumber;

        int attempt = 0;

        do {
            System.out.print(MyColors.BLUE + "Enter your number please from 0 to 100 " + MyColors.RESET);
            yourNumber = scanner.nextInt();

            if (yourNumber > 100 || yourNumber < 0) {
                System.out.println(MyColors.RED + "You broke the rule of game 🤯🤯" + MyColors.RESET);
                break;
            }

            if (yourNumber == exactNumber) {
                System.out.println(MyColors.YELLOW + "You guess the number , You won the game 🥳🏆🥇🏅" + MyColors.RESET);

            } else if (yourNumber > exactNumber) {
                System.out.println(MyColors.PURPLE + "Your number is higher , please enter a smaller number" + MyColors.RESET);

            } else {
                System.out.println(MyColors.PURPLE + "Your number is lower , please enter a larger number" + MyColors.RESET);
            }

            if (attempt >= 9) {
                break;
            }

            ++attempt;

        }
        while (yourNumber != exactNumber);

        if (attempt == 1 && yourNumber == exactNumber) {
            System.out.println(MyColors.YELLOW + "What a perfect answer 🥇🥇🥇 ");
        } else if (attempt <= 3 && yourNumber == exactNumber) {
            System.out.println(MyColors.YELLOW + "You are clever 🏆");
        } else if (attempt <= 5 && yourNumber == exactNumber) {
            System.out.println(MyColors.YELLOW + "Well done 😇");
        } else if (attempt < 9 && yourNumber == exactNumber) {
            System.out.println(MyColors.YELLOW + "Thanks to God , At last you made it 😂" + MyColors.RESET);
        } else {
            System.out.println(MyColors.RED + "You lose the game 😭");
            System.out.println("You can't guess the number 🥺");
        }
        if (attempt < 9 && yourNumber == exactNumber) {
            System.out.println(MyColors.GREEN + "You can guess the number by " + attempt + " attempt " + MyColors.RESET);
        }

        scanner.close();
    }

    public class MyColors {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
        public static final String BOLD = "\u001B[1m";
    }
}
