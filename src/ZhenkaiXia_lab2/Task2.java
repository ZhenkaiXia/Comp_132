package ZhenkaiXia_lab2;

import java.util.Scanner;

public class Task2 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an amount of money: ");
        double money = sc.nextDouble() * 100;

        System.out.println((int)(money / 100) + " Dollars\n"
                + (int)((money %= 100) / 25) + " Quarters\n"
                + (int)((money %= 25) / 10) + " Dimes\n"
                + (int)((money %= 10) / 5) + " Nickels\n"
                + (int)(money %= 5) + "Pennies\n"
        );
    }
}
