package deck;

import java_card.ICardRank;

public class BriscolaCardRank implements ICardRank
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
