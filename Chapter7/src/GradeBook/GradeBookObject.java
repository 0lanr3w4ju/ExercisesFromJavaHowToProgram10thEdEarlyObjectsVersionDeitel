package GradeBook;

public class GradeBookObject {
    public static void main(String[] args) {
        int[] gradeArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBookClass gradeBook = new GradeBookClass("Introduction to Java programming", gradeArray);

        System.out.printf("Welcome to the grade book for%n%s%n%n",
                gradeBook.getCourseName());
        gradeBook.processGrades();
    }
}
