package deck;

import deck.Card.Rank;
import deck.Card.Suit;

public class BriscolaCard extends Card
{
	public enum Suit
	{
		SWORDS,
		CUPS,
		COINS,
		CLUBS,
		BRISCOLA,
	}

	public enum Rank
	{
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		KNAVE,
		KNIGHT,
		KING,
	}

	private boolean isBriscola;
	
	public BriscolaCard(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
		this.isBriscola = false;
	}
	
	/*
	 * Return the card's value for totaling
	 */
	public int getValue()
	{
		switch(this.rank)
		{
		case ACE:
			return 11;
		case THREE:
			return 10;
		case KING:
			return 4;
		case KNIGHT:
			return 3;
		case KNAVE:
			return 2;
		default:
			return 0;
		}
	}
	
	/*
	 * Whether this card's suit is the same as the briscola's
	 */
	public boolean isBriscola()
	{
		return false;
	}
	
	/*
	 * Return true if this card is better than the given card.
	 */
	public boolean isBetter(BriscolaCard card)
	{
		/* if this isn't the briscola but the other card is */
		if( !this.isBriscola() && card.isBriscola() )
		{
			return false;
		}
		
		return false;
	}
}
