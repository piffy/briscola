package deck;

import java.util.ArrayList;
import java.util.Collection;

import java_card.CardPlayer;
import java_card.ICard;

public class BriscolaPlayer extends CardPlayer
{
	public ICard play(Collection<ICard> played)
	{
		return ((ArrayList<ICard>)this.hand).get(0);
	}

	// TODO: something more substantial is needed here - need to know who has played what
	public void seePlayedHand(Collection<ICard> hand)
	{
		boolean briscolaPlayedByOpposition = false;
		boolean briscolaPlayedByTeamMate = false;
	}
}
