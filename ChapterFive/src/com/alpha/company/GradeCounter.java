package com.alpha.company;

public class GradeCounter{
    // author: Olanrewaju Alawode

    // grade counter program counts how many grade times a grade was had

    int a_count;
    int b_count;
    int c_count;
    int d_count;
    int f_count;
    int gradeCounter;

    public void gradeCounterMethod(int grade){
        switch (grade / 10) {
            case 10, 9 -> {
                a_count++;
                gradeCounter++;
            }
            case 8 -> {
                b_count++;
                gradeCounter++;
            }
            case 7 -> {
                c_count++;
                gradeCounter++;
            }
            case 6 -> {
                d_count++;
                gradeCounter++;
            }
            default -> {
                f_count++;
                gradeCounter++;
            }
        }
    }

    public void report(){
        System.out.printf("%s %7s %n %s %7d %n %s %7d %n %s %7d %n %s %7d %n %s %7d %n",
                "grade", "count", "As", a_count, "Bs", b_count, "Cs", c_count, "Ds", d_count,
                "Fs", f_count);
    }

}
