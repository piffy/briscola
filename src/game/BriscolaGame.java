package game;

import java.util.Collection;

import java_card.CardGame;
import java_card.CardSuit;

public class BriscolaGame extends CardGame
{
	public static final int HAND_SIZE = 3;
	public static final int TEAM_PLAYERS = 2;
	public static final int NUM_PLAYERS = 4;
	
	protected Collection<BriscolaTeam> teams;
	
	protected CardSuit briscola;
	
	public BriscolaGame()
	{
		teams.add(new BriscolaTeam(1, TEAM_PLAYERS));
		teams.add(new BriscolaTeam(2, TEAM_PLAYERS));
	}
	
	public CardSuit getBriscola()
	{
		return this.briscola;
	}
}