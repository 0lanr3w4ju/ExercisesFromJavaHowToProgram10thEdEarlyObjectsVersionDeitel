package com.alpha.company;

public class AnalysisOfExaminationResults {

    //class variables
    private int pass;
    private int fail;

    //class methods
    public void resultInput(int input) {
        if (input == 1 || input == 2) {
            if (input == 1) {
                pass++;
            } else fail++;
        } else throw new IllegalArgumentException("wrong entry, you can only input one or two");
    }

    public int getPass() {
        return pass;
    }

    public int getFail() {
        return fail;
    }

}
