package deck;

import java_card.CardRank;

public class BriscolaCardRank implements CardRank
{
	public enum BriscolaRank
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
	
	private BriscolaRank rank;
	
	public BriscolaCardRank(BriscolaRank rank)
	{
		this.rank = rank;
	}
	
	public int ordinal()
	{
		return rank.ordinal();
	}
}
