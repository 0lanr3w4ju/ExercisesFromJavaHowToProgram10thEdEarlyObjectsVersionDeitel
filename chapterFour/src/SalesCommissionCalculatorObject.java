import com.alpha.company.SalesCommissionCalculator;

import java.util.Scanner;

public class SalesCommissionCalculatorObject {

    public static void main(String[] args) {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        Scanner scan = new Scanner(System.in);

        int decision;
        double totalItemValues = 0;
        System.out.print("enter item from 1 - 4: ");
        decision = scan.nextInt();
        System.out.println("you have selected item: "+ salesCommissionCalculator.items(decision) +", value: $"+ salesCommissionCalculator.itemsValues(decision));
        totalItemValues += salesCommissionCalculator.itemsValues(decision);
        while (decision != -1) {
            System.out.print("enter item from 1 - 4: ");
            decision = scan.nextInt();
            System.out.println("you have selected item: "+ salesCommissionCalculator.items(decision) +", value: $"+ salesCommissionCalculator.itemsValues(decision));
            totalItemValues += salesCommissionCalculator.itemsValues(decision);
        }
        System.out.printf("total sales person's earnings: $%.3f", salesCommissionCalculator.calculatesSalesPersonEarnings(totalItemValues));
    }

}
