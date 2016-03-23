package deck;

import java.util.ArrayList;
import java.util.Collection;

import java_card.CardPlay;
import java_card.CardTeamPlayer;
import java_card.ICard;
import java_card.Team;

public class BriscolaPlayer extends CardTeamPlayer
{
	public BriscolaPlayer(Team team)
	{
		super(team);
	}

	public ICard play(Collection<CardPlay> playedCards)
	{
		boolean briscolaPlayedByOpposition = false;
		boolean briscolaPlayedByTeamMate = false;
		int place = playedCards.size();
		
		for (CardPlay play: playedCards)
		{
			BriscolaPlayer player = (BriscolaPlayer)play.getPlayer();
			BriscolaCard card = (BriscolaCard)play.getCard();
			
			if (player.getTeam().equals(this.getTeam()) && card.isBriscola())
			{
				briscolaPlayedByTeamMate = true;
			}
		}
		
		return ((ArrayList<ICard>)this.getHand()).get(0);
	}

	public void seePlayedCards(Collection<CardPlay> playedCards)
	{
		// TODO: needed?
	}
}
