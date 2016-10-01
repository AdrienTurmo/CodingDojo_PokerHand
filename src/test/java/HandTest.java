import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandTest {
    @Test
    public void getHighestCardValue_ShouldReturn14_WhenThereIsAnAce() {
        // Given
        Hand hand = new Hand("2S 3D 4H 5C AS");

        // When
        int highestCardValue = hand.highestCardValue();

        // Then
        assertEquals(14, highestCardValue);
    }

    @Test
    public void getHighestCardValue_ShouldReturn7_WhenSevenIsHighest() {
        // Given
        Hand hand = new Hand("2S 3D 4H 5C 7S");

        // When
        int highestCardValue = hand.highestCardValue();

        // Then
        assertEquals(7, highestCardValue);
    }

    @Test
    public void getHighestCardValue_ShouldReturn9_WhenNineIsHighest() {
        // Given
        Hand hand = new Hand("2S 3D 4H 5C 9S");

        // When
        int highestCardValue = hand.highestCardValue();

        // Then
        assertEquals(9, highestCardValue);
    }

    @Test
    public void getHighestCardValue_ShouldReturn9_WhenNineIsHighestInThirdPosition() {
        // Given
        Hand hand = new Hand("2S 3D 9H 5C 7S");

        // When
        int highestCardValue = hand.highestCardValue();

        // Then
        assertEquals(9, highestCardValue);
    }

    @Test
    public void getCards_ShouldReturnFiveCards_FromAHand() {
        // Given
        Hand hand = new Hand("2S 3D 4H 5C 9S");

        // When
        ArrayList<Card> cards = hand.getCards();

        // Then
        assertEquals(5, cards.size());
        assertEquals(true, cards.get(0).isEqual(new Card("2S")));
        assertEquals(true, cards.get(1).isEqual(new Card("3D")));
        assertEquals(true, cards.get(2).isEqual(new Card("4H")));
        assertEquals(true, cards.get(3).isEqual(new Card("5C")));
        assertEquals(true, cards.get(4).isEqual(new Card("9S")));
    }

}