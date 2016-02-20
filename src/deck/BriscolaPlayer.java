package deck;

import java.util.ArrayList;
import java.util.Collection;

import java_card.CardPlay;
import java_card.CardPlayer;
import java_card.CardTeamPlayer;
import java_card.ICard;

public class BriscolaPlayer extends CardTeamPlayer
{
	public ICard play(Collection<ICard> played)
	{
		return ((ArrayList<ICard>)this.hand).get(0);
	}

	// TODO: something more substantial is needed here - need to know who has played what
	public void seePlayedCards(Collection<CardPlay> playedCards)
	{
		boolean briscolaPlayedByOpposition = false;
		boolean briscolaPlayedByTeamMate = false;
		
		for (CardPlay play: playedCards)
		{
			BriscolaPlayer player = (BriscolaPlayer)play.getPlayer();
			BriscolaCard card = (BriscolaCard)play.getCard();
			
			if (player.getTeam().equals(this.team) && card.isBriscola())
			{
				briscolaPlayedByTeamMate = true;
			}
		}
	}
}
