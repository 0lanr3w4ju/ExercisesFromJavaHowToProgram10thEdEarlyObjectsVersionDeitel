package com.alpha.company;

public class GasMileage {
    /* Java application that will take input miles driven and gallons used
    * for each trip */

    double milesDriven = 0;
    double gallonsUsed = 0;

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(double gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public double milesPerGallon() {
        return getMilesDriven() / getGallonsUsed();
    }
}
