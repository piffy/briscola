package deck;

import java_card.CardSuit;

public class BriscolaCardSuit implements CardSuit
{
	public enum BriscolaSuit
	{
		SWORDS,
		CUPS,
		COINS,
		CLUBS,
	}
	
	private BriscolaSuit suit;
	
	public BriscolaCardSuit(BriscolaSuit suit)
	{
		this.suit = suit;
	}
	
	public int ordinal()
	{
		return suit.ordinal();
	}
}
