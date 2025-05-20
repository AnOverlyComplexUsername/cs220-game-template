package game.template;

// maps 
public enum CardCollection {
    TEST_CARD(new AttackCard(1, "eliv.jpg", "testCard"));

    private final AbstractCard card;

    private CardCollection(AbstractCard card) {
        this.card = card;
    }

    public AbstractCard getCard() {
        return card;
    }

}
