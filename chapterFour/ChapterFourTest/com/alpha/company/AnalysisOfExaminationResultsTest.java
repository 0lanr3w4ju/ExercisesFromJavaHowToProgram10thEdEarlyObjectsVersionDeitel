package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalysisOfExaminationResultsTest {

    @Test
    void  testForPassToOnlyIncreaseIfOneIsEntered() {
        AnalysisOfExaminationResults analysisOfExaminationResults = new AnalysisOfExaminationResults();
        analysisOfExaminationResults.resultInput(1);
        analysisOfExaminationResults.resultInput(1);
        analysisOfExaminationResults.resultInput(2);
        assertEquals(2, analysisOfExaminationResults.getPass());
    }

    @Test
    void  testForFailToOnlyIncreaseIfTwoIsEntered() {
        AnalysisOfExaminationResults analysisOfExaminationResults = new AnalysisOfExaminationResults();
        analysisOfExaminationResults.resultInput(2);
        analysisOfExaminationResults.resultInput(1);
        analysisOfExaminationResults.resultInput(2);
        analysisOfExaminationResults.resultInput(2);
        assertEquals(3, analysisOfExaminationResults.getFail());
    }

}