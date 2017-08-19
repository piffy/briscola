package game;

import java.util.ArrayList;
import java.util.Collection;

import java_card.CardGame;
import java_card.ICardSuit;

public class BriscolaGame extends CardGame
{
	public static final int HAND_SIZE = 3;
	public static final int TEAM_PLAYERS = 2;
	public static final int NUM_PLAYERS = 4;
	
	protected Collection<BriscolaTeam> teams;
	
	protected ICardSuit briscola;
	
	public BriscolaGame()
	{
		teams = new ArrayList<BriscolaTeam>(2);
		teams.add(new BriscolaTeam(1, TEAM_PLAYERS));
		teams.add(new BriscolaTeam(2, TEAM_PLAYERS));
	}
	
	public ICardSuit getBriscola()
	{
		return this.briscola;
	}

	public Collection<BriscolaTeam> getTeams()
	{
		return this.teams;
	}
}