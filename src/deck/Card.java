package deck;

public class Card
{
	public enum Suit
	{
		//
	}
	
	public enum Rank
	{
		//
	}
	
	protected Suit suit;
	protected Rank rank;
	
	protected Card()
	{
		//
	}
	
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
}