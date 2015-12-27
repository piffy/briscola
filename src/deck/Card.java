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
		return 0;
	}
	
	/*
	 * Return true if this card is better than the given card.
	 */
	public boolean isBetter(Card card)
	{
		return false;
	}
}