public class PokerHand {


    public String compareHands(Hand leftHand, Hand rightHand) {
        return (leftHand.highestCardValue()>rightHand.highestCardValue()) ? "L" : "R";
    }
}

