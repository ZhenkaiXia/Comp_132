package XiaZhenkai_lab4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        final int COMPOUND_PER_YEAR = 1; // annual
        final double INTEREST_RATE = 0.025; // 2.5% / year

        Scanner input = new Scanner(System.in);

    do{
            double principal; // initial investment, $
            double future; // value at end of investment, $

            do{
                System.out.print("Initial Investment: ");
                principal = input.nextDouble();

                if(principal > 0)break;

                System.out.println("Please enter a valid input.");
            }while(true);


            // 6-month term, no compounding (simple interest)
            future = principal * (1 + INTEREST_RATE / 2);

            System.out.printf("6 month: $%,.2f\n", future);

            // 1-5 year terms, compounding
            future = principal;
            for (int years = 1; years < 6; years++) {
                future *= (1 + INTEREST_RATE / COMPOUND_PER_YEAR);
                System.out.printf(years + " year:  $%,.2f\n", future);
            }
            System.out.println();

        }while(true);


    }
}