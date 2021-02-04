package com.alpha.company;

public class AutoPolicyObject {

    public static void main(String[] args) {
        AutoPolicy autoPolicyOne = new AutoPolicy(1111, "bugatti veyron", "ME");
        AutoPolicy autoPolicyTwo = new AutoPolicy(1231, "aston martin", "NJ");

        policyInNoFaultState(autoPolicyOne);
        policyInNoFaultState(autoPolicyTwo);
    }

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.printf("account no: %d%n" +
                        "car: %s%n" +
                        "state: %s " +
                        "%s a no-fault state%n%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState(), policy.isNoFaultState() ? "is" : "is not");
    }

}
