package com.alpha.company;

import java.util.Random;

public class Limericks {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"}; // <-- #####
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        int holdOn = getRandomChosen(); // random number has been saved here
        int hold = holdOn; // same as here

        for(int index = 0; index < 5; index++) {
            if (index == 2) {
                hold = getRandomChosen();
            } else if (index == 4) {
                hold = holdOn;
            }
            String articleChosen = article[getRandomChosen()];
            String nounChosen = noun[getRandomChosen()];
            String verbChosen = verb[getRandomChosen()];
            String prepositionChosen = preposition[getRandomChosen()];
            String articleChosen1 = article[getRandomChosen()];
            String nounChosen1 = noun[hold];

            String limerick = String.format("%s %s %s %s %s %s.", articleChosen, nounChosen, verbChosen, prepositionChosen, articleChosen1, nounChosen1);
            System.out.println(limerick);
        }
    }
    private static int getRandomChosen() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
