package XiaZhenkai_lab5;

import java.util.Scanner;

/**
 * Runs a simple lottery with a lottery number between 0 and 99, returns a prize based on input.
 *
 * @author C0496793 Zhenkai Xia
 */
public class Task1 {
    /**
     * A simple lottery with a lottery number between 0 and 99 and unlimited players, returns a prize based on input.
     *
     * @param args the command line arguments
     */
    public static void main (String []args) {
        /* base game
        int lottery = generateLottery();
        int guess = getGuess();

        switch(checkGuess(lottery, guess)){
            case 'Y':
                System.out.println("You've won $" + 10000);
                break;
            case 'O':
                System.out.println("You've won $" + 3000);
                break;
            case 'P':
                System.out.println("You've won $" + 1000);
                break;
            case 'N':
            default:
                System.out.println("You've won $" + 0);
        }
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("How many people are playing:");
        int players = sc.nextInt();

        int lottery = generateLottery();
        int[] guess = new int[players];

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + i + ":");
            guess[i] = getGuess();
        }

        for (int i = 0 ; i < players ; i++) {

            System.out.print("\nPlayer " + (i + 1) + " won $");

            switch (checkGuess(lottery, guess[i])) {
                case 'Y':
                    System.out.print(10000);
                    break;
                case 'O':
                    System.out.print(3000);
                    break;
                case 'P':
                    System.out.print(1000);
                    break;
                case 'N':
                default:
                    System.out.print(0);
            }
        }
    }

    /**
     * generates a random two digit lottery number.
     *
     * @return A random two digit int as the lottery number
     */
    public static int generateLottery(){
        return (int)(Math.random()*100);
    }

    /**
     * Returns the guess made by the player and makes sure it is valid.
     *
     * @return A valid guess made by the player.
     */
    public static int getGuess(){
        Scanner sc = new Scanner(System.in);
        int out;

        do {
            try{
                System.out.println("Enter a number between 0 and 99: ");
                out = Integer.parseInt(sc.nextLine());

            }catch(Exception e){
                System.out.println("Invalid input. Try again.");
                continue;
            }

            if(out < 0 || out > 99){
                System.out.println("Invalid input. Try again.");
                continue;
            }

            return out;
        }while(true);
    }

    /**
     * Checks how correct the guess was against the lottery.
     * Y = Fully correct
     * O = Wrong order
     * P = Partially correct
     * N = Not correct
     *
     * @param lottery The lottery number generated.
     * @param guess The guess made by the player
     * @return A char indicating the correctness of the guess.
     */
    public static char checkGuess(int lottery, int guess){
        if(lottery == guess) return 'Y';

        if(guess / 10 == lottery % 10 && guess % 10 == lottery /10){
            return 'O';
        }
        else if(Integer.toString(lottery).contains(Integer.toString(guess / 10)) ||
                Integer.toString(lottery).contains(Integer.toString(guess % 10))){
            return 'P';
        }

        return 'N';
    }
}
