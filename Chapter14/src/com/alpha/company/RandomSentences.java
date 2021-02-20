package com.alpha.company;

import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {

        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for(int index = 0; index < 20; index++) {
            String articleChosen = article[getRandomChosen()];
            articleChosen = articleChosen.substring(0, 1).toUpperCase() + articleChosen.substring(1).toLowerCase();
            String nounChosen = noun[getRandomChosen()];
            String verbChosen = verb[getRandomChosen()];
            String prepositionChosen = preposition[getRandomChosen()];
            String articleChosen1 = article[getRandomChosen()];
            String nounChosen1 = noun[getRandomChosen()];

            String sentence = String.format("%s %s %s %s %s %s.", articleChosen, nounChosen, verbChosen, prepositionChosen, articleChosen1, nounChosen1);
            System.out.println(sentence);
        }
    }
    private static int getRandomChosen() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
