package XiaZhenkai_lab7;

public class AcademicRecord {
    private Person student;
    private String major;
    private short year;
    private double [] grades;

    AcademicRecord(Person student){
        this.student = student;
        this.major = "undeclared";
        this.year = 1;
        this.grades = new double[10];
    }

    public long calculateAverage(){
        double total = 0;
        for(double i : grades){
            total += i;
        }

        return (long)(total / this.grades.length);
    }

    /**
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
        return "";
    }
}
