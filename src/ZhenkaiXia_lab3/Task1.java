package ZhenkaiXia_lab3;

import java.util.Scanner;

/**
 * Determines how many days are in a month using a chosen year and month
 *
 * @author C0496793 Zhenkai Xia
 */
public class Task1 {

    /**
     * main
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Enter a month: ");
        String month = sc.next();

        int out = 30;
        switch(month){
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                out = 31;
                break;

            case "February":
                if(year % 4 == 0 && year % 100 != 0){
                    out = 29;
                } else {
                    out = 28;
                }
                break;

            default: break;
        }

        System.out.println(out);
    }
}
