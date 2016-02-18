package deck;

import java_card.CardGame;
import java_card.CardSuit;

public class BriscolaGame extends CardGame
{
	public static final int HAND_SIZE = 3;
	public static final int NUM_PLAYERS = 4;
	
	private CardSuit briscola;
	
	public CardSuit getBriscola()
	{
		return this.briscola;
	}
}
