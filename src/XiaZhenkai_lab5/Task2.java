package XiaZhenkai_lab5;

import java.util.Scanner;

/**
 * Processes a list of students' grades to calculate a GPA for each student and the class average.
 *
 * @author C0496793 Zhenkai Xia
 */
public class Task2 {

    /**
     * Processes a list of students' grades to calculate a GPA for each student and the class average.
     *
     * @param args The command line arguments.
     **/
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        /* for generating random students and grades
        int students = (int)(Math.random() * 10 + 1);
        String [][] names = generateNames(students);
        String [][] double = generateGrades(students, ((int)(Math.random() * 5 + 1)));

        test values

        String[][] names = {
                { "Ewell", "Nate" },
                { "Smurthwaite", "Adelina" },
                { "Bernollet", "Maryjane" },
                { "Chalfain", "Karlis" },
                { "Huckabe", "Almire" }
        };
        double[][] grades = {
                { 3.83, 9.21, 9.25, 0.84, 1.40, 7.90, 1.41, 5.15 },
                { 5.09, 3.66, 3.04, 3.02, 8.59, 2.34, 8.86, 7.40 },
                { 5.35, 0.85, 8.56, 7.37, 2.78, 3.19, 2.04, 5.70 },
                { 9.25, 9.62, 7.08, 7.27, 9.86, 5.88, 9.86, 9.70 },
                { 3.39, 2.75, 1.23, 1.04, 3.87, 8.72, 4.60, 6.21 }
        };

         */

        String [][] names = getNames(sc);
        double [][] grades = getGrades(sc, names);

        double [] GPA = calculateGPA(grades);

        printAverage(names, GPA);
    }

    /**
     * Asks the user to input the students' first and last names.
     *
     * @param sc The Scanner for reading inputs.
     * @return  Array of names of all students.
     */
    public static String [][] getNames(Scanner sc){
        System.out.println("How many students:");
        int students = Integer.parseInt(sc.nextLine());

        String [][] names = new String[students][2];

        for(int i = 0 ; i < students ; i++){
            System.out.println("\nEnter student " + (i + 1) + "'s Last name:");
            names[i][0] = sc.nextLine();

            System.out.println("\nEnter student " + (i + 1) + "'s First name:");
            names[i][1] = sc.nextLine();
        }

        return names;
    }

    /**
     * Generates an array of random student names.
     *
     * @param students The amount of students.
     * @return Array of names of all students.
     */
    public static String [][] generateNames(int students){
        String [][] names = new String[students][2];

        for(int i = 0 ; i < students ; i++){
            names[i][0] = "LastName" + (i + 1);
            names[i][1] = "FirstName" + (i + 1);
        }

        return names;
    }

    /**
     * Asks the user to input the students' grades.
     *
     * @param sc The Scanner for reading inputs.
     * @param names Array of all student names.
     * @return Array of grades for all assignments from every student.
     */
    public static double [][] getGrades(Scanner sc, String [][] names){
        System.out.println("\nHow many assignments:");
        int assignments = sc.nextInt();
        double [][] grades = new double[names.length][assignments];

        for(int i = 0 ; i < grades.length ; i++){
            for(int j = 0 ; j < grades[i].length ; j++){
                System.out.println("\nEnter " + names[i][1] + " " + names[i][0] +
                        "'s grade for assignment " + (j + 1) + ":");
                grades[i][j] = sc.nextDouble();
            }
        }

        return grades;
    }

    /**
     * Generates an array of random grades.
     *
     * @param students The amount of students.
     * @param assignments The amount of assignments.
     * @return Array of grades for all assignments from every student.
     */
    public static double [][] generateGrades(int students, int assignments){
        double [][] grades = new double[students][assignments];

        for(int i = 0 ; i < grades.length ; i++){
            for(int j = 0 ; j < grades[i].length ; j++){
                grades[i][j] = (int)(Math.random()*1001) / 100.0;
            }
        }

        return grades;
    }

    /**
     * Calculates the GPA for every student.
     *
     * @param grades Array of grades for all assignments from every student.
     * @return Array of GPA of every student.
     */
    public static double [] calculateGPA(double [][] grades){
        double [] out = new double[grades.length];

        for(int i = 0; i < grades.length ; i++){
            double gpa = 0;

            for(double j : grades[i]){
                gpa += j;
            }

            out[i] = roundToHundredth(gpa / grades[i].length);
        }

        return out;
    }

    /**
     * Prints the GPA of every student and class average.
     *
     * @param names Array of every student's first and last name.
     * @param GPA Array of the GPA of every student.
     */
    public static void printAverage(String [][] names, double [] GPA){
        System.out.println("\nStudent GPAs:");
        double total = 0;

        for(int i = 0 ; i < GPA.length ; i++){
            System.out.println(names[i][1] + " " + names[i][0] + ": " + GPA[i]);

            total += GPA[i];
        }

        System.out.println("\nClass average: " + roundToHundredth(total / GPA.length));
    }

    /**
     * Rounds the double to the hundredth.
     *
     * @param in the number to be rounded
     * @return The input to the hundredth.
     */
    public static double roundToHundredth(double in){
        in *= 100;

        if(in * 10 % 10 >= 5)in += 1;

        return (int)in / 100.0;
    }
}
