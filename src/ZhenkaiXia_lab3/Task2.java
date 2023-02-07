package ZhenkaiXia_lab3;

import java.util.Scanner;

/**
 * Runs a simple lottery with a lottery number between 0 and 99, returns a prize based on input.
 *
 * @author C0496793 Zhenkai Xia
 */
public class Task2 {

    /**
     * main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);

        System.out.println("Enter a number between 0 and 99: ");
        int in = sc.nextInt();

        int prize = 0;

        if(num == in) prize = 10000;
        else if(in < 100 && in >= 0) {
            if(in / 10 == num % 10 && in % 10 == num /10){
                prize = 3000;
            }
            else if(Integer.toString(num).contains(Integer.toString(in / 10)) ||
                    Integer.toString(num).contains(Integer.toString(in % 10))){
                prize = 1000;
            }

        }

        System.out.println("You've won $" + prize);
    }
}
