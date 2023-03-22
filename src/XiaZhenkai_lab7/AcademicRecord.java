package XiaZhenkai_lab7;

/**
 * Collects the academic records of any student.
 *
 * @author Zhenkai Xia
 */
public class AcademicRecord {
    private Person student;
    private String major;
    private short year;
    private double [] grades;
    private final int [] gradeBreakPoints = {90, 85, 80, 77, 73, 70, 65, 60, 50};
    private final String [] letterGrades = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D"};

    /**
     * Creates an academic record for a student with no
     *
     * @param student the student to record
     */
    public AcademicRecord(Person student){
        this.student = student;
        this.major = "undeclared";
        this.year = 1;
        this.grades = new double[10];
    }

    /**
     * Calculates the average of the student.
     *
     * @return The average of the student's grades
     */
    public long calculateAverage(){
        double total = 0;
        for(double i : grades){
            total += i;
        }

        return (long)(total / this.grades.length);
    }

    /**
     * Gives a letter grade for the student based on their average.
     * 90-100	A+
     * 85-89	A
     * 80-84	A-
     * 77-79	B+
     * 73-76	B
     * 70-73	B-
     * 65-69	C+
     * 60-64	C
     * 50-59	D
     * 0 -49	F
     *
     * @return The letter grade based on the average.
     */
    public String calculateLetterGrade(){
        long grade = calculateAverage();

        for(int i = 0; i < gradeBreakPoints.length ; i++){
            if(grade >= gradeBreakPoints[i]) return letterGrades[i];
        }

        return "F";
    }

    /**
     * Outputs the academic records of the student.
     *
     * @return formatted records of the student.
     */
    public String toString(){
        return "AcademicRecord: " + this.student.getID() + " " + this.major + " " + calculateLetterGrade();
    }
}
