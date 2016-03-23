package deck;

import java_card.ICardSuit;

public class BriscolaCardSuit implements ICardSuit
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
