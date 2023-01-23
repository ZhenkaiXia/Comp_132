package ZhenkaiXia_lab2;

import java.util.Scanner;

public class Task1 {
    /**
     *
     * @param args the command line arguments
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter the amount of credit hours you will be taking:");
        double hours = sc.nextDouble();

        System.out.println("What is the fee per hour:");
        double fee = sc.nextDouble();

        System.out.println("Name: " + name
                + "\nHours: " + hours
                + "\nTotal Tuition: $" + (hours * fee)
        );
    }
}
