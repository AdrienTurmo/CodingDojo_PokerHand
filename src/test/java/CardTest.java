import org.junit.Test;

import static org.junit.Assert.*;


public class CardTest {

    @Test
    public void isEqual_ShouldReturnTrue_WhenSameCard() {
        // Given
        Card card1 = new Card("2S");
        Card card2 = new Card("2S");

        // When
        boolean isEqual = card1.isEqual(card2);

        // Then
        assertEquals(true, isEqual);
    }

    @Test
    public void isEqual_ShouldReturnTrue_WhenSameCardWithHead() {
        // Given
        Card card1 = new Card("KS");
        Card card2 = new Card("KS");

        // When
        boolean isEqual = card1.isEqual(card2);

        // Then
        assertEquals(true, isEqual);
    }

    @Test
    public void isEqual_ShouldReturnFalse_WhenValueIsDifferent() {
        // Given
        Card card1 = new Card("2S");
        Card card2 = new Card("3S");

        // When
        boolean isEqual = card1.isEqual(card2);

        // Then
        assertEquals(false, isEqual);
    }

    @Test
    public void isEqual_ShouldReturnFalse_WhenThereIsAnAce() {
        // Given
        Card card1 = new Card("AS");
        Card card2 = new Card("2H");

        // When
        boolean isEqual = card1.isEqual(card2);

        // Then
        assertEquals(false, isEqual);
    }

    @Test
    public void isEqual_ShouldReturnFalse_WhenColorIsDifferent() {
        // Given
        Card card1 = new Card("2S");
        Card card2 = new Card("2H");

        // When
        boolean isEqual = card1.isEqual(card2);

        // Then
        assertEquals(false, isEqual);
    }

}