
public class Card {

    private final String color;
    private final int value;

    public Card(String cardString) {
        int value = convertValueFromString(cardString);
        this.value = value;
        this.color = cardString.substring(1, 2);
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public boolean isEqual(Card otherCard) {
        return this.value == otherCard.getValue() & this.color.equals(otherCard.getColor());
    }

    private int convertValueFromString(String cardString) {
        String valueString = cardString.substring(0, 1);
        int value;
        if (valueString.equals("A")) {
            value = 14;
        } else if (valueString.equals("K")) {
            value = 13;
        } else if (valueString.equals("Q")) {
            value = 12;
        } else if (valueString.equals("J")) {
            value = 11;
        } else if (valueString.equals("T")) {
            value = 10;
        } else {
            value = Integer.valueOf(valueString);
        }
        return value;
    }
}
