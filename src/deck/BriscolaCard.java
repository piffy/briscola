package deck;

import java_card.Card;
import java_card.CardRank;
import java_card.CardSuit;

public class BriscolaCard extends Card
{
	// TODO: this is dependent on game state
	private boolean isBriscola;
	
	public BriscolaCard(CardSuit suit, CardRank rank)
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
		int rank = this.rank.ordinal();
		
		if( rank == BriscolaCardRank.BriscolaRank.ACE.ordinal() )
		{
			return 11;
		}
		if( rank == BriscolaCardRank.BriscolaRank.THREE.ordinal() )
		{
			return 10;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KING.ordinal() )
		{
			return 4;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KNIGHT.ordinal() )
		{
			return 3;
		}
		if( rank == BriscolaCardRank.BriscolaRank.KNAVE.ordinal() )
		{
			return 2;
		}
	
		return 0;
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
