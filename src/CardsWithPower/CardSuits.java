package CardsWithPower;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    CardSuits(int suitsPower) {
        this.suitPower = suitsPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
