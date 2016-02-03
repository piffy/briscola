package deck;

import java.util.ArrayList;
import java.util.Collection;

import java_card.CardPlayer;
import java_card.ICard;

public class BriscolaPlayer extends CardPlayer
{
	@Override
	public ICard play(Collection<ICard> played) {
		return ((ArrayList<ICard>)this.hand).get(0);
	}

	public void seePlayedHand(Collection<ICard> hand)
	{
		// TODO: implement
	}
}
