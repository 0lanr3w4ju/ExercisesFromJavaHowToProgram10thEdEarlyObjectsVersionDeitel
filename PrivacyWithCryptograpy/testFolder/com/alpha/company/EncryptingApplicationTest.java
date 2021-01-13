package com.alpha.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptingApplicationTest {

    @Test
    void toTestThatApplicationTakesOnlyFourIntegerDigits() {
        EncryptingApplication encryptingApplication = new EncryptingApplication();
        encryptingApplication.setFourDigit[0] = 1;
        encryptingApplication.setFourDigit[1] = 1;
        encryptingApplication.setFourDigit[2] = 1;
        encryptingApplication.setFourDigit[3] = 1;
        assertEquals(1, encryptingApplication.setFourDigit[2]);
    }

    @Test
    void toTestThatSevenGetsAddedToEachFourDigitAndReplacedByRemainderAfterDivisionByTen() {
        EncryptingApplication encryptingApplication = new EncryptingApplication();
        encryptingApplication.setFourDigit[2] = 11;
        encryptingApplication.addSevenToDigitAndDivideByTenToGetRemainder();
        assertEquals(8, encryptingApplication.setFourDigit[2]);
    }

    @Test
    void toTestThatFirstDigitGetsSwappedWithThirdDigit() {
        EncryptingApplication encryptingApplication = new EncryptingApplication();
        encryptingApplication.setFourDigit[0] = 1;
        encryptingApplication.setFourDigit[2] = 3;
        encryptingApplication.firstSwap();
        assertEquals(1, encryptingApplication.setFourDigit[2]);
        assertEquals(3, encryptingApplication.setFourDigit[0]);
    }

    @Test
    void toTestThatSecondDigitGetsSwappedWithFourthDigit() {
        EncryptingApplication encryptingApplication = new EncryptingApplication();
        encryptingApplication.setFourDigit[1] = 2;
        encryptingApplication.setFourDigit[3] = 4;
        encryptingApplication.secondSwap();
        assertEquals(2, encryptingApplication.setFourDigit[3]);
        assertEquals(4, encryptingApplication.setFourDigit[1]);
    }

}