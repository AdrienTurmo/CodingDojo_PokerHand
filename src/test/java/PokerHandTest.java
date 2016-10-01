import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerHandTest {

    private PokerHand pokerHand;

    @Before
    public void setUp() {
        pokerHand = new PokerHand();
    }

    @Test
    public void compareHands_ShouldReturnR_whenHighestCardIsInRightHand() {
        // When
        String bestHand = pokerHand.compareHands(new Hand("2S 3D 4H 5C 7S"), new Hand("2D 3S 4C 5H 8S"));

        // Then
        assertEquals("R", bestHand);
    }

    @Test
    public void compareHands_ShouldReturnL_whenHighestCardIsInLeftHand() {
        // When
        String bestHand = pokerHand.compareHands(new Hand("2S 3D 4H 5C 8S"), new Hand("2D 3S 4C 5H 7S"));

        // Then
        assertEquals("L", bestHand);
    }

    @Test
    public void compareHands_ShouldReturnL_whenHighestCardIsInLeftHand2() {
        // When
        String bestHand = pokerHand.compareHands(new Hand("2S 3D 4H 5C 9S"), new Hand("2D 3S 4C 5H 7S"));

        // Then
        assertEquals("L", bestHand);
    }

    @Test
    public void compareHands_ShouldReturnL_whenLeftHandHasAce() {
        // When
        String bestHand = pokerHand.compareHands(new Hand("2S 3D 4H 5C AS"), new Hand("2D 3S 4C 5H 9S"));

        // Then
        assertEquals("L", bestHand);
    }

}
