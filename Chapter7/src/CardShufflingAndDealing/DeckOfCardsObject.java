package CardShufflingAndDealing;

public class DeckOfCardsObject {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards(); // the DeckOfCards constructor creates the deck with the 52 card objects.

        deckOfCards.shuffle();

        for (int index = 1; index <= 52; index++) {
            System.out.printf("%-19s", deckOfCards.dealCard());

            if (index % 4 == 0) {
                System.out.println();
            }
        }
    }
}
