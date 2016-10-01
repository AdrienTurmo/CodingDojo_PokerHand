import java.util.ArrayList;
import java.util.OptionalInt;

public class Hand {

    private final ArrayList<Card> cards;

    public Hand(String fiveCards) {
        this.cards = this.constructCardsList(fiveCards);
    }

    public int highestCardValue() {
        OptionalInt first = cards.stream()
                .mapToInt(card -> card.getValue())
                .max();
        return (first.isPresent()) ? first.getAsInt() : 0;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    private ArrayList<Card> constructCardsList(String fiveCards) {
        String[] cardsList = fiveCards.split(" ");
        ArrayList<Card> cards = new ArrayList<>();
        for (int index = 0; index < 5; index++) {
            Card cardToAdd = new Card(cardsList[index]);
            cards.add(cardToAdd);
        }
        return cards;
    }
}
