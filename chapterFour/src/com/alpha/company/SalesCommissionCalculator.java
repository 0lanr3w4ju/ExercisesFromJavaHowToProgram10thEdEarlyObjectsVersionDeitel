package com.alpha.company;

public class SalesCommissionCalculator {

    double value;

    public int items(int item) {
        return item;
    }

    public double itemsValues(int item) {
        if (item == 1)
            value = 239.99;
        else if (item == 2)
            value = 129.75;
        else if (item == 3)
            value = 99.95;
        else if (item == 4)
            value = 350.89;
        else value = 0;
        return value;
    }

    public double calculatesSalesPersonEarnings(double value) {
        return 200 + 0.09 * value;
    }
}
