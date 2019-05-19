package game;

import deck.BriscolaCard;
import java_card.CardPlay;

public class BriscolaCardPlay extends CardPlay {

    public boolean isBriscola() {
        return ((BriscolaCard)this.card).isBriscola();
    }
}
