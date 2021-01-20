package com.alpha.company;

public class AnalysisOfExaminationResults {

    int pass;
    int fail;

    public void resultInput(int input) {
        if (input == 1 || input == 2) {
            if (input == 1) {
                pass++;
            } else fail++;
        }
    }

    public int getPass() {
        return pass;
    }

    public int getFail() {
        return fail;
    }

}
