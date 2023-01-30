package ZhenkaiXia_lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);

        System.out.println("Enter a number between 0 and 99: ");
        int in = sc.nextInt();

        int prize = 0;

        if(in == num){
            prize = 10000;

        }else if(num > 9){
            prize = 1000 * multiplier(num, in);
        }

        System.out.println("You've won $" + prize);
    }

    public static int multiplier(int num, int in){
        int out = 0;


        return out;
    }
}
