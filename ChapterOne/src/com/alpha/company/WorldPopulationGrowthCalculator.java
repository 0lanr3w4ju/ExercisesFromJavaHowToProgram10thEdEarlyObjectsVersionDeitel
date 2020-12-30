package com.alpha.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
/*
     an application that takes the current population, rate of growth, and time period(one, two, three, four, five years.. etc)
     then displays the estimated population after inputted time period.

 formula used
 ------------
  Nt = P (e) raise to power (r * t)

  Nt -> number of people at future time.
  P -> population at beginning time.
  e -> base of natural logarithms (2.71828).
      r -> rate of increase (natural increase / 100).
      t -> time period involved.
*/

    DecimalFormat decimalFormat = new DecimalFormat("#.###");//used to round 3 decimal points

    //class variables
    double convertedRateOfIncrease;
    String roundedConvertedRateOfIncrease;
    double naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved;
    String roundedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved;
    double convertedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved;
    String roundedPopulationByBaseOfNaturalLogarithms;
    double convertedPopulationByBaseOfNaturalLogarithms;
    double currentPopulation;
    double populationGrowthRate;
    private int timePeriod;
    double rateOfIncrease;
    private double rateOfIncreaseByTimePeriodInvolved;
    private double baseOfNaturalLogarithms;
    private double estimatedPopulationGrowthRate;

    //class methods
    public double rateOfIncrease(double rateOfIncrease) {
        roundedConvertedRateOfIncrease = decimalFormat.format(rateOfIncrease / 100);
        convertedRateOfIncrease = Double.parseDouble(roundedConvertedRateOfIncrease);
        return convertedRateOfIncrease;
    }

    public double rateOfIncreaseByTimePeriodInvolved(double rateOfIncrease, int timePeriodInvolved) {
        return rateOfIncrease * timePeriodInvolved;
    }

    public double naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved(double rateOfIncreaseByTimePeriodInvolved) {
        naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved = Math.pow(2.71828, rateOfIncreaseByTimePeriodInvolved);
        roundedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved = decimalFormat.format(naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved);
        convertedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved = Double.parseDouble(roundedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved);
        return convertedNaturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved;
    }


    public double populationByBaseOfNaturalLogarithms(double population, double baseOfNaturalLogarithms) {
        roundedPopulationByBaseOfNaturalLogarithms = decimalFormat.format(population * baseOfNaturalLogarithms);
        convertedPopulationByBaseOfNaturalLogarithms = Double.parseDouble(roundedPopulationByBaseOfNaturalLogarithms);
        return convertedPopulationByBaseOfNaturalLogarithms;
    }

    //class object
    public static void main(String[] args) {
        WorldPopulationGrowthCalculator worldPopulationGrowthCalculator = new WorldPopulationGrowthCalculator();
        Scanner scan = new Scanner(System.in);

        //prompts
        System.out.print("enter current population in decimal: ");
        worldPopulationGrowthCalculator.currentPopulation = scan.nextDouble();

        System.out.print("enter population growth rate in decimal: ");
        worldPopulationGrowthCalculator.populationGrowthRate = scan.nextDouble();

        System.out.print("enter time period to calculate for in year(s): ");
        worldPopulationGrowthCalculator.timePeriod = scan.nextInt();

        //logic or formula
        worldPopulationGrowthCalculator.rateOfIncrease = worldPopulationGrowthCalculator.rateOfIncrease(worldPopulationGrowthCalculator.populationGrowthRate);

        worldPopulationGrowthCalculator.rateOfIncreaseByTimePeriodInvolved = worldPopulationGrowthCalculator.rateOfIncreaseByTimePeriodInvolved(worldPopulationGrowthCalculator.rateOfIncrease, worldPopulationGrowthCalculator.timePeriod);

        worldPopulationGrowthCalculator.baseOfNaturalLogarithms = worldPopulationGrowthCalculator.naturalLogarithmsRaiseToPowerRateOfIncreaseByTimePeriodInvolved(worldPopulationGrowthCalculator.rateOfIncreaseByTimePeriodInvolved);

        worldPopulationGrowthCalculator.estimatedPopulationGrowthRate = worldPopulationGrowthCalculator.populationByBaseOfNaturalLogarithms(worldPopulationGrowthCalculator.currentPopulation, worldPopulationGrowthCalculator.baseOfNaturalLogarithms);

        //output
        System.out.println("estimated population in "+ worldPopulationGrowthCalculator.timePeriod +" year(s) = " +worldPopulationGrowthCalculator.estimatedPopulationGrowthRate);
    }

}
