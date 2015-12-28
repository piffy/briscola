package deck;

public class Card
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
	
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public Rank getRank()
	{
		return rank;
	}
	
	public Suit getSuit()
	{
		return suit;
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
	 * Return true if this card is better than the given card.
	 */
	public boolean isBetter(Card card)
	{
		return false;
	}
}