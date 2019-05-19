package deck;

import java.util.List;

import game.BriscolaCardPlay;
import java_card.CardPlay;
import java_card.CardTeamPlayer;
import java_card.ICard;

public class BriscolaPlayer extends CardTeamPlayer
{
	public ICard play(List<CardPlay> playedCards)
	{
		boolean briscolaPlayedByOpposition = false;
		boolean briscolaPlayedByTeamMate = false;
		int place = playedCards.size();
		
		for (CardPlay play: playedCards)
		{
			BriscolaPlayer player = (BriscolaPlayer)play.getPlayer();
			BriscolaCard card = (BriscolaCard)play.getCard();
		}
		
		return this.getHand().get(0);
	}

	public void seePlayedCards(List<CardPlay> playedCards)
	{
		// TODO: needed?
	}
}
